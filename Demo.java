public class Demo<T> {
    
    T container;

    public Demo(T container) {
        this.container = container;
    }

    void print(){
        System.out.println(container);
    }
    //if we use Object here then we can't store it in any specific class like string or integer
    T get(){
        return container;
    }
}
