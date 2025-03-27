class PalletRunner
{
        public static void main(String[] args) 
        {
           String material = "Hardwood";
           double weight = 70.0;
           int capacity = 250;
           String color = "Dark Brown";
           boolean isReusable = true;
           int id = 105;
           String brand = "StrongWood";
           double price = 299.99;
           String shape = "Square";
           boolean isStackable = true; 

           Pallet pallet=new Pallet();
           pallet.info();

           Pallet pallet1=new Pallet(material);
           pallet1.info();

           Pallet pallet2=new Pallet(material,weight);
           pallet2.info();

           Pallet pallet3=new Pallet(material,weight,capacity);
           pallet3.info();

           Pallet pallet4=new Pallet(material,weight,capacity,color);
           pallet4.info();

           Pallet pallet5=new Pallet(material,weight,capacity,color,isReusable);
           pallet5.info();

           Pallet pallet6=new Pallet(material,weight,capacity,color,isReusable,id);
           pallet6.info();

           Pallet pallet7=new Pallet(material,weight,capacity,color,isReusable,id,brand);
           pallet7.info();

           Pallet pallet8=new Pallet(material,weight,capacity,color,isReusable,id,brand,price);
           pallet8.info();

           Pallet pallet9=new Pallet(material,weight,capacity,color,isReusable,id,brand,price,shape);
           pallet9.info();

           Pallet pallet10=new Pallet(material,weight,capacity,color,isReusable,id,brand,price,shape,isStackable);
           pallet10.info();
      
        }
}