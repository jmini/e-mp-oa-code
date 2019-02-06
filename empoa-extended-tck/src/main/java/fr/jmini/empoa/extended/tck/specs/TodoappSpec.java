/*******************************************************************************
 * Copyright 2019 Jeremie Bresson
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
package fr.jmini.empoa.extended.tck.specs;

import static org.eclipse.microprofile.openapi.OASFactory.*;

import org.eclipse.microprofile.openapi.models.Components;
import org.eclipse.microprofile.openapi.models.OpenAPI;
import org.eclipse.microprofile.openapi.models.Operation;
import org.eclipse.microprofile.openapi.models.PathItem;
import org.eclipse.microprofile.openapi.models.Paths;
import org.eclipse.microprofile.openapi.models.info.Info;
import org.eclipse.microprofile.openapi.models.info.License;
import org.eclipse.microprofile.openapi.models.media.Content;
import org.eclipse.microprofile.openapi.models.media.MediaType;
import org.eclipse.microprofile.openapi.models.media.Schema;
import org.eclipse.microprofile.openapi.models.parameters.Parameter;
import org.eclipse.microprofile.openapi.models.parameters.RequestBody;
import org.eclipse.microprofile.openapi.models.responses.APIResponse;
import org.eclipse.microprofile.openapi.models.responses.APIResponses;
import org.eclipse.microprofile.openapi.models.servers.Server;
import org.eclipse.microprofile.openapi.models.tags.Tag;

public final class TodoappSpec {
  public static OpenAPI create() {
    return createObject(OpenAPI.class)
        .openapi("3.0.1")
        .info(
            createObject(Info.class)
                .title("A TODO-Task list application")
                .description("A simple application to handle tasks.")
                .license(
                    createObject(License.class)
                        .name("Eclipse Public License 2.0")
                        .url("https://www.eclipse.org/org/documents/epl-2.0/EPL-2.0.html")
                )
                .version("1.0.0")
        )
        .addServer(
            createObject(Server.class)
                .url("http://localhost:8080/todoapp")
        )
        .addTag(
            createObject(Tag.class)
                .name("task")
                .description("Task management")
        )
        .paths(
            createObject(Paths.class)
                .addPathItem(
                    "/task", createObject(PathItem.class)
                        .GET(
                            createObject(Operation.class)
                                .addTag("task")
                                .summary("Get the list of all tasks")
                                .operationId("tasksGetAll")
                                .responses(
                                    createObject(APIResponses.class)
                                        .addApiResponse(
                                            "200", createObject(APIResponse.class)
                                                .description("List of all tasks")
                                                .content(
                                                    createObject(Content.class)
                                                        .addMediaType(
                                                            "application/json", createObject(MediaType.class)
                                                                .schema(
                                                                    createObject(Schema.class)
                                                                        .type(Schema.SchemaType.ARRAY)
                                                                        .items(
                                                                            createObject(Schema.class)
                                                                                .ref("#/components/schemas/Task")
                                                                        )
                                                                )
                                                        )
                                                )
                                        )
                                        .addApiResponse(
                                            "default", createObject(APIResponse.class)
                                                .description("Generic error response")
                                                .content(
                                                    createObject(Content.class)
                                                        .addMediaType(
                                                            "application/json", createObject(MediaType.class)
                                                                .schema(
                                                                    createObject(Schema.class)
                                                                        .ref("#/components/schemas/Error")
                                                                )
                                                        )
                                                )
                                        )
                                )
                        )
                        .POST(
                            createObject(Operation.class)
                                .addTag("task")
                                .summary("Create a new task")
                                .operationId("tasksCreate")
                                .requestBody(
                                    createObject(RequestBody.class)
                                        .content(
                                            createObject(Content.class)
                                                .addMediaType(
                                                    "application/json", createObject(MediaType.class)
                                                        .schema(
                                                            createObject(Schema.class)
                                                                .ref("#/components/schemas/Task")
                                                        )
                                                )
                                        )
                                )
                                .responses(
                                    createObject(APIResponses.class)
                                        .addApiResponse(
                                            "200", createObject(APIResponse.class)
                                                .description("The created task")
                                                .content(
                                                    createObject(Content.class)
                                                        .addMediaType(
                                                            "application/json", createObject(MediaType.class)
                                                                .schema(
                                                                    createObject(Schema.class)
                                                                        .ref("#/components/schemas/Task")
                                                                )
                                                        )
                                                )
                                        )
                                        .addApiResponse(
                                            "default", createObject(APIResponse.class)
                                                .description("Generic error response")
                                                .content(
                                                    createObject(Content.class)
                                                        .addMediaType(
                                                            "application/json", createObject(MediaType.class)
                                                                .schema(
                                                                    createObject(Schema.class)
                                                                        .ref("#/components/schemas/Error")
                                                                )
                                                        )
                                                )
                                        )
                                )
                        )
                )
                .addPathItem(
                    "/task/{taskId}", createObject(PathItem.class)
                        .GET(
                            createObject(Operation.class)
                                .addTag("task")
                                .summary("Get a single task based on its id")
                                .operationId("tasksRead")
                                .responses(
                                    createObject(APIResponses.class)
                                        .addApiResponse(
                                            "200", createObject(APIResponse.class)
                                                .description("Ok")
                                                .content(
                                                    createObject(Content.class)
                                                        .addMediaType(
                                                            "application/json", createObject(MediaType.class)
                                                                .schema(
                                                                    createObject(Schema.class)
                                                                        .ref("#/components/schemas/Task")
                                                                )
                                                        )
                                                )
                                        )
                                        .addApiResponse(
                                            "default", createObject(APIResponse.class)
                                                .description("Generic error response")
                                                .content(
                                                    createObject(Content.class)
                                                        .addMediaType(
                                                            "application/json", createObject(MediaType.class)
                                                                .schema(
                                                                    createObject(Schema.class)
                                                                        .ref("#/components/schemas/Error")
                                                                )
                                                        )
                                                )
                                        )
                                )
                        )
                        .PUT(
                            createObject(Operation.class)
                                .addTag("task")
                                .summary("Update an existing task")
                                .operationId("tasksUpdate")
                                .requestBody(
                                    createObject(RequestBody.class)
                                        .content(
                                            createObject(Content.class)
                                                .addMediaType(
                                                    "application/json", createObject(MediaType.class)
                                                        .schema(
                                                            createObject(Schema.class)
                                                                .ref("#/components/schemas/Task")
                                                        )
                                                )
                                        )
                                )
                                .responses(
                                    createObject(APIResponses.class)
                                        .addApiResponse(
                                            "200", createObject(APIResponse.class)
                                                .description("The updated task")
                                                .content(
                                                    createObject(Content.class)
                                                        .addMediaType(
                                                            "application/json", createObject(MediaType.class)
                                                                .schema(
                                                                    createObject(Schema.class)
                                                                        .ref("#/components/schemas/Task")
                                                                )
                                                        )
                                                )
                                        )
                                        .addApiResponse(
                                            "default", createObject(APIResponse.class)
                                                .description("Generic error response")
                                                .content(
                                                    createObject(Content.class)
                                                        .addMediaType(
                                                            "application/json", createObject(MediaType.class)
                                                                .schema(
                                                                    createObject(Schema.class)
                                                                        .ref("#/components/schemas/Error")
                                                                )
                                                        )
                                                )
                                        )
                                )
                        )
                        .DELETE(
                            createObject(Operation.class)
                                .addTag("task")
                                .summary("Delete an existing task")
                                .operationId("tasksDelete")
                                .responses(
                                    createObject(APIResponses.class)
                                        .addApiResponse(
                                            "204", createObject(APIResponse.class)
                                                .description("Task deleted response")
                                        )
                                        .addApiResponse(
                                            "default", createObject(APIResponse.class)
                                                .description("Generic error response")
                                                .content(
                                                    createObject(Content.class)
                                                        .addMediaType(
                                                            "application/json", createObject(MediaType.class)
                                                                .schema(
                                                                    createObject(Schema.class)
                                                                        .ref("#/components/schemas/Error")
                                                                )
                                                        )
                                                )
                                        )
                                )
                        )
                        .addParameter(
                            createObject(Parameter.class)
                                .name("taskId")
                                .in(Parameter.In.PATH)
                                .description("The id of the task")
                                .required(true)
                                .style(Parameter.Style.SIMPLE)
                                .explode(false)
                                .schema(
                                    createObject(Schema.class)
                                        .type(Schema.SchemaType.STRING)
                                )
                                .example("e1cb23d0-6cbe-4a29-b586-bfa424bc93fd")
                        )
                )
        )
        .components(
            createObject(Components.class)
                .addSchema(
                    "Task", createObject(Schema.class)
                        .addRequired("description")
                        .type(Schema.SchemaType.OBJECT)
                        .addProperty(
                            "completed", createObject(Schema.class)
                                .type(Schema.SchemaType.BOOLEAN)
                                .description("indicates if a taks is completed or not")
                        )
                        .addProperty(
                            "description", createObject(Schema.class)
                                .type(Schema.SchemaType.STRING)
                                .description("description of the task")
                                .example("My important task")
                        )
                        .addProperty(
                            "id", createObject(Schema.class)
                                .type(Schema.SchemaType.STRING)
                                .description("id of the taks")
                                .readOnly(true)
                                .example("e1cb23d0-6cbe-4a29-b586-bfa424bc93fd")
                        )
                        .description("Object representing a Task")
                )
                .addSchema(
                    "Error", createObject(Schema.class)
                        .type(Schema.SchemaType.OBJECT)
                        .addProperty(
                            "code", createObject(Schema.class)
                                .type(Schema.SchemaType.INTEGER)
                                .description("Error code that identify of the error")
                                .format("int32")
                                .example(1000)
                        )
                        .addProperty(
                            "message", createObject(Schema.class)
                                .type(Schema.SchemaType.STRING)
                                .description("Short description of the error")
                                .example("Could not perform the task")
                        )
                        .description("Object representing an error")
                )
        );
  }
}
