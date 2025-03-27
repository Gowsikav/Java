class Pallet 
{
    String material;
    double weight;
    int capacity;
    String color;
    boolean isReusable;
    int id;
    String brand;
    double price;
    String shape;
    boolean isStackable;

    Pallet()
    {
        System.out.println("No argument Constructor");
    }
    
    Pallet(String material)
    {
        this.material=material;
    }

    Pallet(String material,double weight)
    {
        this(material);
        this.weight=weight;
    }

    Pallet(String material,double weight,int capacity)
    {
        this(material,weight);
        this.capacity=capacity;
    }

    Pallet(String material,double weight,int capacity,String color)
    {
        this(material,weight,capacity);
        this.color=color;
    }

    Pallet(String material,double weight,int capacity,String color,boolean isReusable)
    {
        this(material,weight,capacity,color);
        this.isReusable=isReusable;
    }

    Pallet(String material,double weight,int capacity,String color,boolean isReusable,int id)
    {
        this(material,weight,capacity,color,isReusable);
        this.id=id;
    }

    Pallet(String material,double weight,int capacity,String color,boolean isReusable,int id,String brand)
    {
        this(material,weight,capacity,color,isReusable,id);
        this.brand=brand;
    }

    Pallet(String material,double weight,int capacity,String color,boolean isReusable,int id,
    String brand,double price)
    {
        this(material,weight,capacity,color,isReusable,id,brand);
        this.price=price;
    }

    Pallet(String material,double weight,int capacity,String color,boolean isReusable,int id,
    String brand,double price,String shape)
    {
        this(material,weight,capacity,color,isReusable,id,brand,price);
        this.shape=shape;
    }

    Pallet(String material,double weight,int capacity,String color,boolean isReusable,int id,
    String brand,double price,String shape,boolean isStackable)
    {
        this(material,weight,capacity,color,isReusable,id,brand,price,shape);
        this.isStackable=isStackable;
    }

    void info()
    {
        System.out.println("\nInstance variable information");

        System.out.println("Pallet material: "+this.material);
        System.out.println("Pallet weight: "+this.weight);
        System.out.println("Pallet capacity: "+this.capacity);
        System.out.println("Pallet color: "+this.color);
        System.out.println("Pallet isReusable: "+this.isReusable);
        System.out.println("Pallet id: "+this.id);
        System.out.println("Pallet brand: "+this.brand);
        System.out.println("Pallet price: "+this.price);
        System.out.println("Pallet shape: "+this.shape);
        System.out.println("Pallet isStackable: "+this.isStackable);

    }

}