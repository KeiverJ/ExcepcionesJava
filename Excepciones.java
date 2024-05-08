import java.io.*;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.invoke.LambdaConversionException;
import java.lang.invoke.StringConcatException;
import java.lang.reflect.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.charset.*;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.ProviderNotFoundException;
import java.security.Provider;
import java.security.Provider.Service;
import java.security.Security;
import java.security.cert.CertificateExpiredException;
import java.time.*;
import java.time.format.DateTimeParseException;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeoutException;

import javax.swing.tree.ExpandVetoException;
import org.ietf.jgss.GSSException;
import javax.management.BadAttributeValueExpException;
import javax.management.modelmbean.InvalidTargetObjectTypeException;
import javax.sound.midi.MidiUnavailableException;

public class Excepciones {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        int excpError;

        do {
            System.out.println("Menú de Excepciones:");
            System.out.println("1. ArithmeticException");
            System.out.println("2. NullPointerException");
            System.out.println("3. ArrayIndexOutOfBoundsException");
            System.out.println("4. NumberFormatException");
            System.out.println("5. FileNotFoundException");
            System.out.println("6. IOException");
            System.out.println("7. ClassNotFoundException");
            System.out.println("8. IllegalArgumentException");
            System.out.println("9. NumberFormatException 2");
            System.out.println("10. NoSuchElementException");
            System.out.println("11. InputMismatchException");
            System.out.println("12. UnsupportedOperationException");
            System.out.println("13. ClassCastException");
            System.out.println("14. StringIndexOutOfBoundsException");
            System.out.println("15. InterruptedException");
            System.out.println("16. ArrayStoreException");
            System.out.println("17. NoSuchMethodException");
            System.out.println("18. DateTimeParseException");
            System.out.println("19. StackOverflowError");
            System.out.println("20. UnsupportedCharsetException");
            System.out.println("21. DateTimeException");
            System.out.println("22. NegativeArraySizeException");
            System.out.println("23. NoSuchFieldException");
            System.out.println("24. IllegalThreadStateException");
            System.out.println("25. ConcurrentModificationException");
            System.out.println("26. MissingResourceException");
            System.out.println("27. IllegalMonitorStateException");
            System.out.println("28. UnknownFormatConversionException");
            System.out.println("29. IllegalFormatFlagsException");
            System.out.println("30. RuntimeException");
            System.out.println("31. UnknownHostException");
            System.out.println("32. IllegalCharsetNameException");
            System.out.println("33. ExecutionException");
            System.out.println("34. ReadOnlyBufferException");
            System.out.println("35. ProviderNotFoundException");
            System.out.println("36. InvalidPathException");
            System.out.println("37. CloneNotSupportedException");
            System.out.println("38. unknownError");
            System.out.println("39. SecurityException");
            System.out.println("40. outOfMemoryError");
            System.out.println("41. BadAttributeValueExpException");
            System.out.println("42. CertificateExpiredExceptionExample");
            System.out.println("43. ExpandVetoException");
            System.out.println("44. GSSException");
            System.out.println("45. IllegalClassFormatException");
            System.out.println("46. InvalidTargetObjectTypeException");
            System.out.println("47. LambdaConversionException");
            System.out.println("48. MidiUnavailableException");
            System.out.println("49. StringConcatenator");
            System.out.println("50. TimeoutException");
            System.out.println("0. Salir");

            System.out.print("Elija una excepción a ejecutar: ");
            excpError = teclado.nextInt();

            switch (excpError) {
                case 1:
                    ArithmeticException();
                    break;
                case 2:
                    nullPointerException();
                    break;
                case 3:
                    arrayIndexOutOfBoundsException();
                    break;
                case 4:
                    numberFormatException();
                    break;
                case 5:
                    fileNotFoundException();
                    break;
                case 6:
                    ioException();
                    break;
                case 7:
                    classNotFoundException();
                    break;
                case 8:
                    illegalArgumentException();
                    break;
                case 9:
                    numberFormatException2();
                    break;
                case 10:
                    noSuchElementException();
                    break;
                case 11:
                    inputMismatchException();
                    break;
                case 12:
                    unsupportedOperationException();
                    break;
                case 13:
                    classCastException();
                    break;
                case 14:
                    stringIndexOutOfBoundsException();
                    break;
                case 15:
                    interruptedException();
                    break;
                case 16:
                    arrayStoreException();
                    break;
                case 17:
                    noSuchMethodException();
                    break;
                case 18:
                    dateTimeParseException();
                    break;
                case 19:
                    stackOverflowError();
                    break;
                case 20:
                    unsupportedCharsetException();
                    break;
                case 21:
                    dateTimeException();
                    break;
                case 22:
                    negativeArraySizeException();
                    break;
                case 23:
                    noSuchFieldException();
                    break;
                case 24:
                    illegalThreadStateException();
                    break;
                case 25:
                    concurrentModificationException();
                    break;
                case 26:
                    missingResourceException();
                    break;
                case 27:
                    illegalMonitorStateException();
                    break;
                case 28:
                    unknownFormatConversionException();
                    break;
                case 29:
                    illegalFormatFlagsException();
                    break;
                case 30:
                    runtimeException();
                    break;
                case 31:
                    unknownHostException();
                    break;
                case 32:
                    illegalCharsetNameException();
                    break;
                case 33:
                    executionException();
                    break;
                case 34:
                    readOnlyBufferException();
                    break;
                case 35:
                    providerNotFoundException();
                    break;
                case 36:
                    invalidPathException();
                    break;
                case 37:
                    cloneNotSupportedException();
                    break;
                case 38:
                    unknownError();
                    break;
                case 39:
                    securityException();
                    break;
                case 40:
                    outOfMemoryError();
                    break;
                case 41:
                    BadAttributeValueExpException();
                    break;
                case 42:
                    CertificateExpiredExceptionExample();
                    break;
                case 43:
                    ExpandVetoException();
                    break;
                case 44:
                    GSSException();
                    break;
                case 45:
                    IllegalClassFormatException();
                    break;
                case 46:
                    InvalidTargetObjectTypeException();
                    break;
                case 47:
                    LambdaConversionException();
                    break;
                case 48:
                    MidiUnavailableException();
                    break;
                case 49:
                    StringConcatenator("Hola", null);
                    break;
                case 50:
                    TimeoutException();
                    break;
                case 0:
                    System.out.println("Chao.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (excpError != 0);
        teclado.close();
    }

    public static void ArithmeticException() {
        try {
            double division = 9 / 0;
            System.out.println("La división es: " + division);
        } catch (ArithmeticException ex) {
            System.out.println("Error: No se puede dividir por cero.");
            ex.printStackTrace();
        }
    }

    @SuppressWarnings("null")
    public static void nullPointerException() {
        String str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException ex) {
            System.out.println("Se produce cuando se intenta acceder o invocar un método en un objeto que es null.");
            ex.printStackTrace();
        }
    }

    public static void arrayIndexOutOfBoundsException() {
        try {
            int[] array = new int[3];
            System.out.println(array[5]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Se produce cuando se intenta acceder a un índice fuera del rango válido de un array.");
            ex.printStackTrace();
        }
    }

    @SuppressWarnings("unused")
    public static void numberFormatException() {
        try {
            String str = "abc";
            int num = Integer.parseInt(str);
        } catch (NumberFormatException ex) {
            System.out.println(
                    "Se produce cuando se intenta convertir una cadena en un tipo numérico, pero la cadena no tiene el formato adecuado.");
            ex.printStackTrace();
        }
    }

    public static void fileNotFoundException() {
        try {
            throw new FileNotFoundException("Se produce cuando se intenta abrir un archivo que no existe.");
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

    public static void ioException() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("mi_archivo.txt"));
            String linea = reader.readLine();
            System.out.println("Primera línea: " + linea);
            reader.close();
        } catch (IOException ex) {
            System.out.println("Error al cerrar el archivo: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    public static void classNotFoundException() {
        try {
            Class.forName("clase.inexistente");
        } catch (ClassNotFoundException ex) {
            System.out.println("Se produce cuando se intenta cargar una clase que no se encuentra en el classpath.");
            ex.printStackTrace();
        }
    }

    public static void illegalArgumentException() {
        try {
            int edad = -5;
            if (edad < 0) {
                throw new IllegalArgumentException("La edad no puede ser negativa.");
            }
        } catch (IllegalArgumentException ex) {
            System.out.println("Se produce cuando se pasa un argumento ilegal o inapropiado a un método.");
            ex.printStackTrace();
        }
    }

    @SuppressWarnings("unused")
    public static void numberFormatException2() {
        try {
            String str = "123abc";
            int num = Integer.parseInt(str);
        } catch (NumberFormatException ex) {
            System.out.println(
                    "Se produce cuando se intenta convertir una cadena en un tipo numérico, pero la cadena no tiene el formato adecuado.");
            ex.printStackTrace();
        }
    }

    @SuppressWarnings("unused")
    public static void noSuchElementException() {
        try {
            List<String> lista = new ArrayList<>();
            String elemento = lista.iterator().next();
        } catch (NoSuchElementException ex) {
            System.out.println(
                    "Se produce cuando se intenta acceder a un elemento que no existe en una colección, como una lista vacía o un conjunto sin el elemento especificado.");
            ex.printStackTrace();
        }
    }

    public static void inputMismatchException() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite su nombre: ");
        try {
            int num = teclado.nextInt();
            System.out.println(num);
        } catch (InputMismatchException ex) {
            System.out.println(
                    "Este error aparece cuando se ha declarado que la variable es de un tipo y se ingresa un dato de otro tipo.");
            ex.printStackTrace();
        }
        teclado.close();
    }

    public static void unsupportedOperationException() {
        try {
            List<String> lista = Collections.emptyList();
            lista.add("elemento");
        } catch (UnsupportedOperationException ex) {
            System.out.println(
                    "Se produce cuando se invoca una operación que no es compatible o no está implementada en una clase específica.");
            ex.printStackTrace();
        }
    }

    @SuppressWarnings("unused")
    public static void classCastException() {
        try {
            Object obj = "cadena";
            Integer num = (Integer) obj;
        } catch (ClassCastException ex) {
            System.out.println(
                    "Se produce cuando se intenta convertir un objeto a un tipo incompatible mediante una operación de casting.");
            ex.printStackTrace();
        }
    }

    @SuppressWarnings("unused")
    public static void stringIndexOutOfBoundsException() {
        try {
            String str = "Hola";
            char caracter = str.charAt(10);
        } catch (StringIndexOutOfBoundsException ex) {
            System.out
                    .println("Se produce cuando se intenta acceder a un índice fuera del rango válido de una cadena.");
            ex.printStackTrace();
        }
    }

    public static void interruptedException() {
        try {
            Thread.currentThread().interrupt();
            Thread.sleep(2000);
            System.out.println("Después de esperar 2 segundos.");
        } catch (InterruptedException ex) {
            System.out.println("Se produce cuando se interrumpe un hilo mientras está en el estado de espera o sueño.");
            ex.printStackTrace();
        }
    }

    public static void arrayStoreException() {
        try {
            Object[] array = new Integer[10];
            array[0] = "cadena";
        } catch (ArrayStoreException ex) {
            System.out.println(
                    "Se produce cuando se intenta almacenar un objeto de un tipo incompatible en un array de tipo primitivo.");
            ex.printStackTrace();
        }
    }

    @SuppressWarnings("unused")
    public static void noSuchMethodException() {
        try {
            Class<?> clase = String.class;
            Method metodo = clase.getMethod("metodoInexistente");
        } catch (NoSuchMethodException ex) {
            System.out.println("Se produce cuando se intenta acceder a un método que no existe en una clase.");
            ex.printStackTrace();
        }
    }

    public static void dateTimeParseException() {
        try {
            String fecha = "2022-13-01";
            LocalDate.parse(fecha);
        } catch (DateTimeParseException ex) {
            System.out.println(
                    "Se produce cuando ocurre un error al analizar una cadena en un objeto de fecha y hora utilizando la API de fecha y hora de Java (java.time).");
            ex.printStackTrace();
        }
    }

    public static void stackOverflowError() {
        try {
            metodoCiclado();
        } catch (StackOverflowError ex) {
            System.out.println("Se produce cuando se ha producido un desbordamiento de pila (StackOverflowError).");
            ex.printStackTrace();
        }
    }

    @SuppressWarnings("unused")
    public static void unsupportedCharsetException() {
        try {
            Charset charset = Charset.forName("UTF-16LA");
        } catch (UnsupportedCharsetException ex) {
            System.out.println(
                    "Se produce cuando se intenta utilizar un conjunto de caracteres (charset) no soportado por el sistema.");
            ex.printStackTrace();
        }
    }

    public static void dateTimeException() {
        try {
            LocalDate.of(2022, 2, 29);
        } catch (DateTimeException ex) {
            System.out.println(
                    "Se produce cuando ocurre un error relacionado con la manipulación de objetos de fecha y hora utilizando la API de fecha y hora de Java (java.time).");
            ex.printStackTrace();
        }
    }

    @SuppressWarnings("unused")
    public static void negativeArraySizeException() {
        try {
            int[] array = new int[-5];
        } catch (NegativeArraySizeException ex) {
            System.out.println("Se produce cuando se intenta crear un array con un tamaño negativo.");
            ex.printStackTrace();
        }
    }

    @SuppressWarnings("unused")
    public static void noSuchFieldException() {
        try {
            Class<?> clase = String.class;
            Field campo = clase.getField("campoInexistente");
        } catch (NoSuchFieldException ex) {
            System.out.println("Se produce cuando se intenta acceder a un campo que no existe en una clase.");
            ex.printStackTrace();
        }
    }

    public static void illegalThreadStateException() {
        try {
            Thread thread = new Thread();
            thread.start();
            thread.start();
        } catch (IllegalThreadStateException ex) {
            System.out.println(
                    "Se produce cuando se realiza una operación inválida en un hilo, como iniciar un hilo que ya ha sido iniciado.");
            ex.printStackTrace();
        }
    }

    public static void concurrentModificationException() {
        try {
            List<String> lista = new ArrayList<>();
            lista.add("A");
            for (String elemento : lista) {
                lista.remove(elemento);
            }
        } catch (ConcurrentModificationException ex) {
            System.out.println(
                    "Se produce cuando se detecta una modificación concurrente durante la iteración de una colección utilizando iteradores \"fall-fast\".");
            ex.printStackTrace();
        }
    }

    @SuppressWarnings("unused")
    public static void missingResourceException() {
        try {
            ResourceBundle bundle = ResourceBundle.getBundle("missing_resource");
            String value = bundle.getString("missing_key");
        } catch (MissingResourceException ex) {
            System.out.println(
                    "Se produce cuando no se encuentra un recurso solicitado, como un archivo de propiedades o una clave en un archivo de propiedades.");
            ex.printStackTrace();
        }
    }

    public static void illegalMonitorStateException() {
        try {
            Object objeto = new Object();
            objeto.wait();
        } catch (InterruptedException ex) {
            System.out.println("No entrará aquí");
        } catch (IllegalMonitorStateException ex) {
            System.out.println(
                    "Se produce cuando se realiza una operación de monitoreo ilegal, como esperar o notificar en un objeto sin poseer el bloqueo adecuado.");
            ex.printStackTrace();
        }
    }

    @SuppressWarnings("unused")
    public static void unknownFormatConversionException() {
        try {
            String mensaje = String.format("%3 %4", "cadena", 123);
        } catch (UnknownFormatConversionException ex) {
            System.out.println("Se produce cuando se proporciona una conversión desconocida.");
            ex.printStackTrace();
        }
    }

    @SuppressWarnings("unused")
    public static void illegalFormatFlagsException() {
        try {
            String mensaje = String.format("% %", "cadena", 123);
        } catch (IllegalFormatFlagsException ex) {
            System.out.println(
                    "Se produce cuando ocurre un error durante la conversión de un argumento en una cadena de formato.");
            ex.printStackTrace();
        }
    }

    public static void runtimeException() {
        try {
            Security.addProvider(new MySecurityProvider(null, 0, null));
        } catch (RuntimeException ex) {
            System.out
                    .println("Se produce cuando ocurre una condición anormal que no puede ser manejada por el código.");
            ex.printStackTrace();
        }
    }

    @SuppressWarnings({ "unused", "resource" })
    public static void unknownHostException() throws IOException {
        try {
            Socket socket = new Socket("host_inexistente", 8080);
        } catch (UnknownHostException ex) {
            System.out.println("Se lanza cuando se intenta acceder a un host cuyo nombre no se puede resolver.");
            ex.printStackTrace();
        }
    }

    @SuppressWarnings("unused")
    public static void illegalCharsetNameException() {
        try {
            Charset charset = Charset.forName("conjunto_de_caracteres_inválido");
        } catch (IllegalCharsetNameException ex) {
            System.out.println("Se lanza cuando se proporciona un nombre de conjunto de caracteres no válido.");
            ex.printStackTrace();
        }
    }

    public static void executionException() {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Callable<Integer> tarea = () -> {
            throw new RuntimeException("Error en la tarea");
        };
        Future<Integer> futuro = executor.submit(tarea);
        try {
            Integer resultado = futuro.get();
            System.out.println("Resultado de la tarea: " + resultado);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        } catch (ExecutionException ex) {
            System.out.println(
                    "Se lanza cuando ocurre un error durante la ejecución de un proceso o tarea en un ExecutorService, por lo general como resultado de un error en el proceso que está siendo ejecutado:\n");
            ex.printStackTrace();
        }
        executor.shutdown();
    }

    @SuppressWarnings("unused")
    private static class channel {
        private static SelectionKey register(Selector selector, int OP_READ) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public channel() {
        }
    }

    public static void readOnlyBufferException() {
        try {
            ByteBuffer buffer = ByteBuffer.allocate(10).asReadOnlyBuffer();
            buffer.put((byte) 1);
        } catch (ReadOnlyBufferException ex) {
            System.out.println("Se lanza cuando se intenta modificar un búfer de solo lectura.");
            ex.printStackTrace();
        }
    }

    @SuppressWarnings("unused")
    public static void providerNotFoundException() {
        try {
            Service service = ServiceLoader.load(Service.class).findFirst()
                    .orElseThrow(() -> new ProviderNotFoundException("Proveedor no encontrado"));
        } catch (ProviderNotFoundException ex) {
            System.out.println("Se lanza cuando no se puede encontrar un proveedor de servicios específico.");
            ex.printStackTrace();
        }
    }

    @SuppressWarnings("unused")
    public static void invalidPathException() {
        try {
            Path path = Paths.get("///siuuuuuiuui");
        } catch (InvalidPathException ex) {
            System.out.println(
                    "Se lanza cuando se proporciona una cadena de ruta de acceso inválida a los métodos de la clase Path.");
            ex.printStackTrace();
        }
    }

    public static void cloneNotSupportedException() {
        class CustomClass {

            @Override
            protected Object clone() throws CloneNotSupportedException {
                return super.clone();
            }
        }

        CustomClass obj = new CustomClass();
        try {
            obj.clone();
        } catch (CloneNotSupportedException ex) {
            System.out.println("Se produce cuando un objeto no admite clonación.");
            ex.printStackTrace();
        }
    }

    public static void unknownError() {
        try {
            throw new UnknownError("Se lanza cuando se produce un error desconocido o no especificado.");
        } catch (UnknownError ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

    public static void securityException() {
        try {
            throw new SecurityException("Simulando una acción que viola las políticas de seguridad.");
        } catch (SecurityException ex) {
            System.out
                    .println("Se produce cuando se intenta realizar una acción que viola las políticas de seguridad.");
            ex.printStackTrace();
        }
    }

    public static void outOfMemoryError() {
        try {
            throw new OutOfMemoryError(
                    "Se lanza cuando el sistema no tiene suficiente memoria para realizar una operación.");
        } catch (OutOfMemoryError ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

    public static void BadAttributeValueExpException() {
        try {
            String atributoInvalido = "nombreAtributo > 10";
            throw new BadAttributeValueExpException(atributoInvalido);
        } catch (BadAttributeValueExpException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

    public static void CertificateExpiredExceptionExample() {
        try {
            String mensaje = "El certificado ha expirado";
            throw new CertificateExpiredException(mensaje);
        } catch (CertificateExpiredException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

    public static void ExpandVetoException() {
        try {
            throw new ExpandVetoException(null, "Se lanza cuando se veta la expansión de un componente.");
        } catch (ExpandVetoException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

    public static void GSSException() {
        try {
            throw new GSSException(GSSException.FAILURE, -1, "Error de autenticación GSS.");
        } catch (GSSException ex) {
            System.out.println("Código de error: " + ex.getMajor());
            System.out.println("Código de error secundario: " + ex.getMinor());
            System.out.println("Mensaje de error: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    public static void IllegalClassFormatException() {
        try {
            throw new IllegalClassFormatException("Formato de clase no válido.");
        } catch (IllegalClassFormatException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

    public static void InvalidTargetObjectTypeException() {
        try {
            throw new InvalidTargetObjectTypeException("Tipo de objeto de destino invalido");
        } catch (InvalidTargetObjectTypeException ex) {
            System.err.println("Ocurrio una excepcion de tipo de objeto de destino invalido: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    public static void LambdaConversionException() {
        try {
            throw new LambdaConversionException("Error: Falló la conversión de la expresión lambda.");
        } catch (LambdaConversionException ex) {
            System.out.println("Se produjo un error en la conversión de la expresión lambda: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    public static void MidiUnavailableException() {
        try {
            throw new MidiUnavailableException("Error: Dispositivo MIDI no disponible.");
        } catch (MidiUnavailableException ex) {
            System.out.println("Se produjo un error: Dispositivo MIDI no disponible.");
            ex.printStackTrace();
        }
    }

    public static String StringConcatenator(String str1, String str2) {
        try {
            if (str1 == null || str2 == null) {
                throw new StringConcatException("No se puede concatenar una cadena nula.");
            }
            return str1 + str2;
        } catch (StringConcatException ex) {
            System.out.println("Error al concatenar cadenas: " + ex.getMessage());
            ex.printStackTrace();
            return null;
        }
    }

    public static void TimeoutException() {
        try {
            throw new TimeoutException("Error: Tiempo de espera agotado.");
        } catch (TimeoutException ex) {
            System.out.println("Se produjo un error: Tiempo de espera agotado.");
            ex.printStackTrace();
        }
    }

    private static class MySecurityProvider extends Provider {

        @SuppressWarnings("deprecation")
        public MySecurityProvider(String name, double version, String info) {
            super(name, version, info);
        }
    }

    public static void metodoCiclado() {
        metodoCiclado();
    }

}
