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

//public class StubMapper extends Mapper<Object, Text, Text, LongWritable> {
//
//  @Override
//  public void map(Object key, Text value, Context context)
//      throws IOException, InterruptedException {
//    /*
//     * TODO implement
//     */
//	  String[] words = value.toString().split("[ \t]+");
//	  for(String word:words)
//	  {
//		  System.out.println("ddd");
//		  System.err.println("erorr");
//		  
//		  context.write(new Text(word), new LongWritable(1));
//	  }
//  }
//}


//public class StubMapper extends Mapper<LongWritable, Text, Text, TextArrayWritable> {
//	private final static TextArrayWritable writable = new TextArrayWritable();
//	private final static Writable[] writables = new Writable[1];
//	private Text newKey = new Text();
//
//	@Override
//	public void map(LongWritable key, Text value, Context context)
//			throws IOException, InterruptedException {
//		String word = value.toString();
//		char[] chars = word.toCharArray();
//		Arrays.sort(chars);
//		newKey.set(new String(chars));
//		writables[0] = new Text(word);
//		writable.set(writables);
//		context.write(newKey, writable);
//	}
//}


public class StubMapper  extends Mapper <Object, Text, Text, Text> {
	
	 @Override
	 public void map(Object key, Text value, Context context) throws IOException, InterruptedException{
		 
		 if (value !=null  && value.toString() !=null) {
			 if (value !=null  && value.toString() !=null) {
				 String[] dNASeq1 = value.toString().split(" ");
				 char[] chars = dNASeq1[1].toCharArray();
				 
//				 String newKey = null;

				 Arrays.sort(chars);
				 Text newKey = new Text();
				 newKey.set(new String(chars));

//				 newKey = dNASeq1[1];
//				 if (dNASeq1[1].compareTo(dNASeq2) == -1) {
//					newKey = dNASeq1[1];
//				 }else
//					 newKey = dNASeq2;
					 
				 context.write(new Text(newKey), new Text(dNASeq1[0]));
		
			 }
		 }
	 }	 
}

	 