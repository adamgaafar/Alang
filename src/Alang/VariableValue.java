package Alang;

public class VariableValue<T> {
    private T value;

    public VariableValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @SuppressWarnings("unchecked")
    public void setValue(Object value) {
        this.value = (T) value;
    }
}

