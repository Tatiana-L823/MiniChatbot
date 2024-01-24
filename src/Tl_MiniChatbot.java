import java.util.Scanner;

public class Tl_MiniChatbot {

    public static void main(String[] args) {
        System.out.println("Willkommen zum Tl_MiniChatbot!");

        greetUser();

        String[] questions = {
                "Wer bist du?",
                "Wie alt bist du?",
                "Wie heißt du?",
                "Was ist deine Aufgabe?"
        };

        String[] answers = {
                "Ich bin der MiniChatbot.",
                "Ich bin so alt wie die Ausführung des Programms selbst.",
                "Ich heiße Mark Cäsar.",
                "Meine Aufgabe ist es, eine Konversation mit meinem Gegenüber zu führen."
        };

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nStelle mir eine Frage oder gib 'Tschüss' ein, um das Programm zu beenden:");

            for (String question : questions) {
                askQuestion(question);
            }

            String userResponse = scanner.nextLine();

            if (userResponse.equalsIgnoreCase("Tschüss")) {
                System.out.println("Tschüss! Bis zum nächsten Mal.");
                break;
            }

            handleUserResponse(userResponse, questions, answers);
        }

        scanner.close();
    }

    private static void greetUser() {
        System.out.println("Hallo! Ich bin dein Tl_MiniChatbot. Stelle mir Fragen, um mit mir zu chatten.");
    }

    private static void askQuestion(String question) {
        System.out.println(question);
    }

    private static void handleUserResponse(String userResponse, String[] questions, String[] answers) {
        for (int i = 0; i < questions.length; i++) {
            if (userResponse.equalsIgnoreCase(questions[i])) {
                System.out.println(answers[i]);
                return;
            }
        }

        System.out.println("Entschuldigung, ich habe keine passende Antwort auf deine Frage. Stelle eine andere Frage.");
    }
}
