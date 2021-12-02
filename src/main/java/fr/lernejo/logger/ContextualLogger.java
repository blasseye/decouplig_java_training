package fr.lernejo.logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ContextualLogger implements Logger{
    String ClassName;
    Logger logger;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
    @Override
    public void log(String message) {
        this.logger.log(LocalDateTime.now().format(formatter)+ " " + this.ClassName + " " + message );
    }
    public ContextualLogger(String p_ClassName, Logger p_Logger){
        this.logger = p_Logger;
        this.ClassName = p_ClassName;
    }
}
