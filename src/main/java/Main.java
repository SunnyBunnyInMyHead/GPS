import jssc.SerialPort;
import jssc.SerialPortException;

public class Main {
    public static void main(String[] args){
        SerialPort port = new SerialPort("/dev/ttyAMA0");
        if(!port.isOpened()) {
            try {
                port.openPort();
                int i = 0;
                while (i<100){
                    System.out.println(port.getInputBufferBytesCount());
                    i++;
                }
            } catch (SerialPortException e) {
                e.printStackTrace();
            }finally {
                try {
                    port.closePort();
                } catch (SerialPortException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
