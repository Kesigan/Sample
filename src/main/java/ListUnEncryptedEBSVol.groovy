import com.amazonaws.regions.Regions
import com.amazonaws.services.ec2.AmazonEC2
import com.amazonaws.services.ec2.AmazonEC2ClientBuilder
import com.amazonaws.services.ec2.model.DescribeVolumesRequest
import com.amazonaws.services.ec2.model.DescribeVolumesResult
import com.amazonaws.services.ec2.model.Filter

class ListUnEncryptedEBSVol implements Serializable {
    private final AmazonEC2 client= AmazonEC2ClientBuilder.standard().withRegion(Regions.US_EAST_1)build()
    List<String> listEBSVolumes(String filterName, String filterValue){
        Filter filter=new Filter().withName(filterName).withValues(filterValue)
        DescribeVolumesRequest request=new DescribeVolumesRequest().withFilters(filter)
        DescribeVolumesResult result=this.client.describeVolumes(request)
        return result.volumes.volumeId
    }
}
