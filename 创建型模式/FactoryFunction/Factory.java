package FactoryFunction;

public class Factory extends IFactory {

    @Override
    public <T extends IProduct> T createPhone(Class<T> product) {
        IProduct phone = null;
        String className = product.getName();

        try {
            //利用反射机制  动态实例 具体产品对象
            phone = (IProduct) Class.forName(className).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) phone;
    }
}
