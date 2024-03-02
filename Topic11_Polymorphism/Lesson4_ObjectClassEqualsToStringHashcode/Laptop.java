package Topic11_Polymorphism.Lesson4_ObjectClassEqualsToStringHashcode;

public class Laptop extends Object{

    String model;
    int price;


    // @Override
    // public String toString(){
    //     return model + " " + price;
    // }



    // @Override
    // public boolean equals(Object obj){
    //     if(obj instanceof Laptop){
    //         Laptop laptop = (Laptop)obj;
    //         if(laptop.model.equals(this.model) && laptop.price == this.price){
    //             return true;
    //         }
    //     }
    //     return false;
    // }


    // Дясно копче -> Source Action -> generate hashcode() and equals()
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

    // Дясно копче -> Source Action -> generate toString()
    @Override
    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + "]";
    }


    



}
    

