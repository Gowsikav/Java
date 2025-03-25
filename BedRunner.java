class BedRunner 
{
    public static void main(String[] args) 
    {
        Bed bed = new Bed();
        System.out.println("Default size value: " + bed.size);
        System.out.println("Default material value: " + bed.material);
        System.out.println("Default hasHeadboard value: " + bed.hasHeadboard);
        System.out.println("Default legs value: " + bed.legs);

        bed.size = "King";
        bed.material = "Wood";
        bed.hasHeadboard = true;
        bed.legs = 4;

        System.out.println("Updated size value: " + bed.size);
        System.out.println("Updated material value: " + bed.material);
        System.out.println("Updated hasHeadboard value: " + bed.hasHeadboard);
        System.out.println("Updated legs value: " + bed.legs);
    }
}
