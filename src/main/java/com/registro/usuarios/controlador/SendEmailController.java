package com.registro.usuarios.controlador;

    import java.io.IOException;
    import javax.mail.MessagingException;
    import javax.mail.internet.AddressException;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RestController;
    import com.registro.usuarios.servicio.SendEmail;

    @RestController
    public class SendEmailController {
        
        @Autowired
        SendEmail sendEmail;
    
        @RequestMapping(value = "/sendemail")
        public String send() throws AddressException, MessagingException, IOException {
            sendEmail.sendEmail("to", "subject", "content");
           return "Email sent successfully";   
        }
    }
     