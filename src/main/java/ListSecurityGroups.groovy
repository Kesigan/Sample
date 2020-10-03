import com.amazonaws.regions.Regions
import com.amazonaws.services.s3.AmazonS3
import com.amazonaws.services.s3.AmazonS3ClientBuilder
import com.amazonaws.services.s3.model.Bucket

class ListSecurityGroups {
    public static void main(String[] args){
        final AmazonS3 s3= AmazonS3ClientBuilder.standard().withRegion(Regions.US_EAST_1).build()
        List<Bucket> buckets=s3.listBuckets()
        System.out.println("Amazon S3 buckets are:")
        buckets.each { Bucket b ->
            System.out.println(b.getName())
        }
    }

}
