import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectTester {

    public Object copy(Object object) throws Exception{
        Class classType = object.getClass();
        System.out.println("Class:" + classType.getName());

        Object objectCopy = classType.getConstructor(new Class[]{}).newInstance(new Object[]{});

        Field fields[] = classType.getFields();

        for(int i = 0; i < fields.length; i++){
            Field field = fields[i];

            String fieldName = field.getName();
            String firstLetter = fieldName.substring(0, 1).toUpperCase();
            String getMethodName = "get" + firstLetter + fieldName.substring(1);
            String setMethodName = "set" + firstLetter + fieldName.substring(1);

            Method getMethod = classType.getMethod(getMethodName, new Class[]{});
            Method setMethod = classType.getMethod(setMethodName, new Class[]{field.getType()});

            Object value = getMethod.invoke(object, new Object[]{});
            System.out.println(fieldName+":"+value);
            setMethod.invoke(objectCopy,new Object[]{value});
        }
        return objectCopy;
    }
}
