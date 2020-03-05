import java.lang.instrument.Instrumentation;

public class ObjectSizeFetch
{
    private static Instrumentation inst;

    public static void premain(String args, Instrumentation ins) {
        inst = ins;
    }

    public static long getObjectSize(Object o) {
        return inst.getObjectSize(o);
    }
}
