package Generics;

public class TypeErasure<T>
{
    private T content;

    public void setContent(T content)
    {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}
