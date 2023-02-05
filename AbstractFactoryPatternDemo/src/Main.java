import phoenix.factory.provider.FactoryProvider;
import phoenix.family.ClothEnum;
import phoenix.family.SerieEnum;
import phoenix.family.impl.*;

/**
 * @author mert on 6.02.2023
 * @project AbstractFactoryPatternDemo
 */
public class Main {
    public static void main(String[] args) {

        //Cloth
        TShirt tShirt = (TShirt) FactoryProvider.getFactory(ClothEnum.TSHIRT).generate(ClothEnum.TSHIRT);
        System.out.println(tShirt.getColor() + " " + tShirt.getType());
        Trousers trousers = (Trousers) FactoryProvider.getFactory(ClothEnum.TROUSERS).generate(ClothEnum.TROUSERS);
        System.out.println(trousers.getColor() + " " + trousers.getType());
        Hoodie hoodie = (Hoodie) FactoryProvider.getFactory(ClothEnum.HOODIE).generate(ClothEnum.HOODIE);
        System.out.println(hoodie.getColor() + " " + hoodie .getType());

        //Serie
        Sopranos sopranos = (Sopranos) FactoryProvider.getFactory(SerieEnum.SOPRANOS).generate(SerieEnum.SOPRANOS);
        System.out.println(sopranos.getName());
        Wednesday wednesday = (Wednesday) FactoryProvider.getFactory(SerieEnum.WEDNESDAY).generate(SerieEnum.WEDNESDAY);
        System.out.println(wednesday.getName());
    }
}