public interface Calculate {

    //Our high level class is going to expect to work with any kind of service that uses this method
    double getTip();

    String getServiceName();

}
