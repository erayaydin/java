class Tipi<T> {
    public T data;

    public void Calistir()
    {
        System.out.println(this.data);
    }
}

class Tipinin<Tipi>{
    public Tipi altTip;
}

class Tipinizin<Tipinin>{
    public Tipinin altTip;

    public void Calistir()
    {
        System.out.println(altTip.getClass().getName());
    }
}

public class GenericTypes
{
    public static void main(String[] args){
        Tipinizin<Tipinin<Tipi<String>>> test = new Tipinizin<Tipinin<Tipi<String>>>();
        test.Calistir();
    }
}

