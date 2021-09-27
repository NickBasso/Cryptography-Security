//module cs.cs {
//    requires javafx.controls;
//    requires javafx.fxml;
//
//    requires org.controlsfx.controls;
//    requires com.dlsc.formsfx;
//    requires org.kordamp.bootstrapfx.core;
//
//    opens cs.cs to javafx.fxml;
//    exports cs.cs;
//}

module jfxEngine {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens jfxEngine to javafx.fxml;
    exports jfxEngine;
}