class RightPyramid {
    public static void main(String[] args) {
        char character = '*';
        int count = 5;
        String array[] = new String[count];

        for (int i = 1; i<=count; i++) {
            array[i-1] = padRow(i, count, character);
        }
  
        
        StringBuilder result = new StringBuilder();
        for (String a : array) {
            result.append("\n").append(a);
        }
     
        String a = (result.toString());
    
        System.out.println(a);
        ;
     
    }

    public static String padRow(int rowNumber, int rowCount, char character) {
        return   repeat(String.valueOf(character+ " "), rowNumber ) + repeat(" ", rowCount - rowNumber);
    }

    // Helper method to manually repeat a string 'n' times
    public static String repeat(String str, int times) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
