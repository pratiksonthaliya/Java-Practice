package I_Functional_Interfaces;

@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
}
