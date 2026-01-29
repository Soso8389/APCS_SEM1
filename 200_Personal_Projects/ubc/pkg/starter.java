import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class YouTubePlayer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        // Create a WebView component
        WebView webView = new WebView();

        // Load the YouTube video using its embed URL
        // Replace "VIDEO_ID" with the actual ID of the YouTube video
        // Example: For "https://www.youtube.com/watch?v=dQw4w9WgXcQ", the ID is "dQw4w9WgXcQ"
        String youtubeEmbedUrl = "https://www.youtube.com/embed/WIRK_pGdIdA?autoplay=1"; // autoplay is optional
        webView.getEngine().load(youtubeEmbedUrl);

        // Create a Scene and add the WebView to it
        Scene scene = new Scene(webView, 800, 600); // Adjust dimensions as needed

        // Set the stage title and show the scene
        stage.setTitle("YouTube Video Player");
        stage.setScene(scene);
        stage.show();
    }
}