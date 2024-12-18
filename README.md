## Nombres
- Cordero, Joe
- Miño. Juan
- Raura, Ariel

# Código Inicial del Proyecto Base
class NotificationService {
    public void sendNotification(String type, String message) {
        if (type.equals("Email")) {
            System.out.println("Sending Email: " + message);
        } else if (type.equals("SMS")) {
            System.out.println("Sending SMS: " + message);
        } else if (type.equals("Push")) {
            System.out.println("Sending Push Notification: " + message);
        } else {
            System.out.println("Invalid notification type!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        service.sendNotification("Email", "Hello via Email!");
        service.sendNotification("SMS", "Hello via SMS!");
        service.sendNotification("Push", "Hello via Push Notification!");
        service.sendNotification("Fax", "Hello via Fax!");
    }
}

# Resultados después de la refactorización
# Pruebas unitarias
![image](https://github.com/user-attachments/assets/44ed2b17-3f89-426d-b69d-f95b8db1e29d)

# Ejecución del código
![image](https://github.com/user-attachments/assets/97fbe148-9cb3-46df-8270-f3abea77e1e5)


# Reflexión sobre el Principio SOLID (OCP)
El Principio de Abierto/Cerrado (OCP) establece que una clase debe estar abierta para su extensión, pero cerrada para su modificación. En la refactorización, hemos hecho lo siguiente:

Abierto para la extensión: Si deseamos agregar un nuevo tipo de notificación (como FaxNotification o SlackNotification), podemos hacerlo creando una nueva clase que implemente la interfaz Notification sin modificar el código existente en la clase NotificationService.
Cerrado para la modificación: La clase NotificationService no ha cambiado. Solo hemos hecho uso de la interfaz Notification y hemos utilizado el polimorfismo para delegar el comportamiento de la notificación.

# Conclusión
La refactorización ha hecho que el código sea más flexible y fácil de mantener.
Las pruebas unitarias ahora están alineadas con la nueva estructura basada en OCP, y se pueden extender fácilmente sin modificar el código existente.
