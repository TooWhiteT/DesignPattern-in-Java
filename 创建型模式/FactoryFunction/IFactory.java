package FactoryFunction;

public abstract class IFactory {
    public abstract <T extends IProduct> T createPhone(Class<T> product);
}
