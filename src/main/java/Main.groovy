class Main {
     static void main(String[] args){
       // AmazonEC2 client = AmazonEC2ClientBuilder.standard().withRegion(Regions.US_EAST_1).build()
//        DescribeVolumesRequest request=new DescribeVolumesRequest().withFilters(new Filter().withName("encrypted").withValues("false"))
//        DescribeVolumesResult result= client.describeVolumes(request)
//        println(result)
        ListUnEncryptedEBSVol ebsVol=new ListUnEncryptedEBSVol();
        Collection<String> result=ebsVol.listEBSVolumes("encrypted","false")
        println(result)
    }
}

