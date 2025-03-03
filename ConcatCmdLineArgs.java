class ConcatCmdLineArgs {
    public static void main(String[] args) {
        String result = "";
        for (String arg : args) 
            result += arg + " ";
        System.out.println("Concatenated String: " + result);
    }
}