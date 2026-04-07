void main() {
    String fileIn = UI.InFileName();
    String fileOut = UI.OutFileName();
    try (BufferedReader reader = new BufferedReader(new FileReader(fileIn));
         BufferedWriter writer = new BufferedWriter(new FileWriter(fileOut))) {

        String line;
        while ((line = reader.readLine()) != null) {

            if (line.trim().isEmpty()) {
                writer.newLine();
                continue;
            }

            String[] words = line.trim().split("\\s+");

            if (words.length >= 4) {
                String temp = words[1];
                words[1] = words[words.length - 2];
                words[words.length - 2] = temp;
            }

            writer.write(String.join(" ", words));
            writer.newLine();
        }

        System.out.println("Check result in file!");

    } catch (IOException e) {
        System.out.println("Error: " + e.getMessage());
    }
}