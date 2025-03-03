class FindWordCmdLineArgs {
    public static void main(String[] args) {
        String target="Hello";
        for (String arg : args) {
            if (arg.equals(target)) {
                System.out.println(target+" is present.");
                return;
            }
        }
        System.out.println(target+" is not present.");
    }
}