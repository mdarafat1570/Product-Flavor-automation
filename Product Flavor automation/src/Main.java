import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("1. Enter the App name (or type 'exit' to quit): ");
            String input1 = scanner.nextLine();
            System.out.print("*. Enter the App URL : ");
            String inputurl1 =scanner.nextLine();
            if (input1.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.print("2. Enter the App name (or type 'exit' to quit): ");
            String input2 = scanner.nextLine();
            System.out.print("*. Enter the App URL : ");
            String inputurl2 =scanner.nextLine();
            if (input2.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.print("3. Enter the App name (or type 'exit' to quit): ");
            String input3 = scanner.nextLine();
            System.out.print("*. Enter the App URL : ");
            String inputurl3 =scanner.nextLine();
            if (input3.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.print("4. Enter the App name (or type 'exit' to quit): ");
            String input4 = scanner.nextLine();
            System.out.print("*. Enter the App URL : ");
            String inputurl4 =scanner.nextLine();
            if (input4.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("5. Enter the App name (or type 'exit' to quit): ");
            String input5 = scanner.nextLine();
            System.out.print("*. Enter the App URL : ");
            String inputurl5 =scanner.nextLine();
            if (input5.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.print("6. Enter the App name (or type 'exit' to quit): ");
            String input6 = scanner.nextLine();
            System.out.print("*. Enter the App URL : ");
            String inputurl6 =scanner.nextLine();
            if (input6.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.print("7. Enter the App name (or type 'exit' to quit): ");
            String input7 = scanner.nextLine();
            System.out.print("*. Enter the App URL : ");
            String inputurl7 =scanner.nextLine();
            if (input7.equalsIgnoreCase("exit")) {
                break;
            }

            generateCode(input1,inputurl1);
            generateCode(input2,inputurl2);
            generateCode(input3,inputurl3);
            generateCode(input4,inputurl4);
            generateCode(input5,inputurl5);
            generateCode(input6,inputurl6);
            generateCode(input7,inputurl7);

        }

        scanner.close();
    }

    public static void generateCode(String appName, String Url) {

        String formattedAppName = appName.replaceAll("\\s", "");
        String appUrl =Url.replaceAll("\\s","");

        // Output templates
        String signingConfigsTemplate = " \n \n"
                + formattedAppName.toLowerCase() + " {\n"
                + "     storeFile file('" + formattedAppName.toLowerCase() + ".jks')\n"
                + "     storePassword \"abc-1234\"\n"
                + "     keyAlias \"softifybd\"\n"
                + "     keyPassword \"abc-1234\"\n"
                +" }\n";

        String productFlavorsTemplate = "// productFlavors\n\n"
                + formattedAppName + " {\n"
                + "     versionNameSuffix \"-free\"\n"
                + "     dimension \"default\"\n"
                + "     applicationId \"com.softifybd." + formattedAppName.toLowerCase() + "\"\n"
                + "     versionCode verCode\n"
                + "     versionName verName\n"
                + "     signingConfig signingConfigs." + formattedAppName.toLowerCase() + "\n"
                + "     buildConfigField \"String\", \"TYPE\", '\"free\"'\n"
                +" }\n";

        String EdufyproductFlavorsTemplate = "   \n"
                + formattedAppName + " {\n"
                + "     versionNameSuffix \"-free\"\n"
                + "     dimension \"default\"\n"
                + "     applicationId \"com.softifybd." + formattedAppName.toLowerCase() + "\"\n"
                + "     versionCode project.verCode \n"
                + "     versionName project.verName\n"
                + "     signingConfig signingConfigs." + formattedAppName.toLowerCase() + "\n"
                + "     buildConfigField 'String', 'BASE_URL', "+"'\"" + appUrl + "'\""+"\n"
                + "     buildConfigField 'String', 'BASE_URL_EXTRA', " + "BaseUrlExtra" + "\n"
                + "     buildConfigField 'String', 'API_KEY', " + "ApiKey" + "\n"
                + "     buildConfigField 'double', 'API_VERSION', " + "ApiVersion" + "\n"
                + "}\n";


        System.out.println(signingConfigsTemplate);
        System.out.println(productFlavorsTemplate);
        //System.out.println(EdufyproductFlavorsTemplate);
       }
    }
