class AnchorRunner 
{
    public static void main(String[] args) 
    {
        Anchor anchor = new Anchor();
        System.out.println("Default weight value: " + anchor.weight);
        System.out.println("Default material value: " + anchor.material);
        System.out.println("Default isRustProof value: " + anchor.isRustProof);
        System.out.println("Default length value: " + anchor.length);

        anchor.weight = 20.5;
        anchor.material = "Steel";
        anchor.isRustProof = true;
        anchor.length = 50;

        System.out.println("Updated weight value: " + anchor.weight);
        System.out.println("Updated material value: " + anchor.material);
        System.out.println("Updated isRustProof value: " + anchor.isRustProof);
        System.out.println("Updated length value: " + anchor.length);
    }
}
