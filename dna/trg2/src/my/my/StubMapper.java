package my;
import java.io.IOException;
import java.util.Arrays;

import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.ArrayWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapreduce.Mapper;


public class StubMapper  extends Mapper <Object, Text, Text, Text> {
	
	 @Override
	 public void map(Object key, Text value, Context context) throws IOException, InterruptedException{
		 
		 if (value !=null  && value.toString() !=null) {
			 String[] dNASeq1 = value.toString().split(" ");
			 String newKey = null;

			 newKey = dNASeq1[1];
				 
			 context.write(new Text(newKey), new Text(dNASeq1[0]));
		}
	 }
}
