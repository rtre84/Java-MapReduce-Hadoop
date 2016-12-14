package my;

import java.util.Arrays;

import org.apache.hadoop.io.ArrayWritable;
import org.apache.hadoop.io.Text;

public class TextArrayWritable extends ArrayWritable {
    public TextArrayWritable() {super(Text.class);}
    public String toString() {
        return Arrays.toString(toStrings());
    }
}