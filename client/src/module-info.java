module io.anviksha.client {
    requires java.base; //  implicit

    //  following is explicitly required, otherwise the import in file won't work
    requires modules.study;
}