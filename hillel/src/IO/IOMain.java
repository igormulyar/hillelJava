package IO;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

/**
 * Created by IMulyar on 19.11.2015.
 */
public class IOMain {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("C:\\Users\\IMulyar\\IdeaProjects\\hillelJava\\hillel\\config.properties")){
            Properties properties = new Properties();

            properties.load(fileInputStream);
            String carOwner = properties.getProperty("carOwner");
            String carYear = properties.getProperty("carYear");
            String carModel = properties.getProperty("carModel");
            String carColor = properties.getProperty("carColor");

            CarOwner owner = new CarOwner(carOwner);
            Car car = new Car(carModel,Integer.parseInt(carYear), owner, carColor);

            System.out.println(car);

        } catch (IOException e){
            System.out.println(e);
        }

    }

    private static void serialVersionUID() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("/myData.dat")))
        {
//
            List<Car> cars = (List<Car>)  objectInputStream.readObject();

            System.out.println(cars);
        } catch (IOException | ClassNotFoundException e)
        {
            System.out.println(e);
        }
    }

    private static void objectStoreAndSerializable() {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("/myData.dat")))
        {
            CarOwner owner = new CarOwner("Michail");
            List<Car> cars = Arrays.asList(new Car("BMW", 1990, owner, "green"), new Car("Honda", 2002, owner, "yellow"));

            for (Car car : cars) {
                owner.addCar(car);
            }


            objectOutputStream.writeObject(cars);

        } catch (IOException e)
        {
            System.out.println(e);
        }

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("/myData.dat")))
        {
//            Object longsAsObject = objectInputStream.readObject();
//            long[] longs = (long[]) longsAsObject;
            List<Car> cars = (List<Car>)  objectInputStream.readObject();
            System.out.println(cars);
        } catch (IOException  | ClassNotFoundException e)
        {
            System.out.println(e);
        }
    }

    private static void arrays() {
        // works for Collections and other Object
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("/myData.dat")))
        {
            long[] longs = new long[]{1, 2, 3, 5, 4};
            objectOutputStream.writeObject(longs);

        } catch (IOException e)
        {
            System.out.println(e);
        }

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("/myData.dat")))
        {
//            Object longsAsObject = objectInputStream.readObject();
//            long[] longs = (long[]) longsAsObject;
            long[] longs = (long[])  objectInputStream.readObject();
            System.out.println(Arrays.toString(longs));
        } catch (IOException  | ClassNotFoundException e)
        {
            System.out.println(e);
        }
    }

    private static void primitiveTypes() {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("/myData.dat"))) {
            long[] longs = new long[]{1, 2, 3, 5, 4};

            for (long aLong : longs) {
                dataOutputStream.writeLong(aLong);
            }

        } catch (IOException e) {
            System.out.println(e);
            throw new RuntimeException(e);
        }

        //some changes to check git


        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream("/myData.dat"))) {
            try {
                while (true) {
                    System.out.println(dataInputStream.readLong());
                }
            } catch (EOFException e) {
                System.out.println("Closing DataInputStream by java.io.EOFException. The end of Reading");
            }

        } catch (IOException e) {
            System.out.println(e);
            throw new RuntimeException(e);
        }
    }


    private static void bufferedRead() {
        try
                (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/myFile.txt"), Charset.forName("windows-1251")));) {
            String value = null;
            while ((value = bufferedReader.readLine()) != null) {
                //System.out.println(value);
            }


        } catch (IOException e) {
            System.out.println(e);
            throw new RuntimeException(e);
        }
    }


    private static void charRead() {
        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("/myFile.txt"), Charset.forName("windows-1251"));) {
            int value;
            while ((value = inputStreamReader.read()) != -1) {
                System.out.print((char) value);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private static void copyBytes() {
        try (InputStream inputStream = new FileInputStream("/myFile.txt");
             OutputStream outputStream = new FileOutputStream("/copyOfMyFile.txt")
        ) {
            int value;
            while ((value = inputStream.read()) != -1) {
                outputStream.write(value);

            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }


    private static void readWithResources() {
        try (InputStream inputStream = new FileInputStream("/myFile.txt")) {
            int value;
            while ((value = inputStream.read()) != -1) {
                System.out.print((char) value);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }


    private static void uglyRead() {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("/myFile.txt");

            int value;
            while ((value = inputStream.read()) != -1) {
                System.out.println((char) value);
            }

        } catch (IOException e) {
            System.out.println(e);
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }
    }

    private static void pathesAndFileCreation() throws IOException {
        System.out.println("Yes\\no");
        System.out.println("c:\\program files\\myProgram");
        System.out.println("/home/myDir");
        String win = "c:\\HaxLogs.txt";
        String unix = "c:/HaxLogs.txt";

        File winFile = new File(win);
        System.out.println("win file exist: " + winFile.exists());

        File unixFile = new File(unix);
        System.out.println("unix file exist: " + unixFile.exists());

        Path path = Paths.get("myFile.txt");
        System.out.println(path);
        System.out.println(path.toAbsolutePath());

        Path absolutePath = Paths.get("/myFile.txt");
        System.out.println(absolutePath);
        System.out.println(absolutePath.toAbsolutePath());

        if (!Files.exists(absolutePath)) {
            Files.createFile(absolutePath);
            System.out.println("file created");
        } else {
            System.out.println("file already exist");
        }
    }


}


