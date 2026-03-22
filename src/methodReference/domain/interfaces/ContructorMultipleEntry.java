package methodReference.domain.interfaces;

@FunctionalInterface
public interface ContructorMultipleEntry<R> {
    R multipleEntrisConstructor(Object ...parameters);
}
