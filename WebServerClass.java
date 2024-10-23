
package one;
//package your.package.name; // Replace with your actual package name
//package your.package.name; // Replace with your actual package name

import blazing.*;
import java.io.IOException;
import java.util.Map;

@WebServer("8080")
public class WebServerClass {

    @Get("/")
    public static void index(BlazingResponse response) {
        // Create a simple HTML form
        String htmlForm = "<html>" +
                "<head><title>Fruit Form</title></head>" +
                "<body>" +
                "<h1>Enter a Fruit</h1>" +
                "<form method='post' action='/submit'>" +
                "<input type='text' name='fruit' placeholder='Enter a fruit'>" +
                "<input type='submit' value='Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";

        response.sendResponse(htmlForm);
    }

    @Post("/submit")
    public static void handleFormSubmission(BlazingResponse response) throws IOException {
        // Retrieve the submitted form data
        Map<String, String> params = response.params();
        
        // Get the value for the "fruit" parameter
        String fruit = params.get("fruit");

        // Create a response page with the submitted data
        String responseHtml = "<html>" +
                "<head><title>Submission Result</title></head>" +
                "<body>" +
                "<h1>You submitted: " + fruit + "</h1>" +
                "<a href='/'>Go back</a>" +
                "</body>" +
                "</html>";

        response.sendResponse(responseHtml);
    }

    public static void main(String[] args) {
        Blazing.createServer(WebServerClass.class);
    }
}



