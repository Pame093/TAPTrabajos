from zeep import Client

cliente = Client('http://localhost:8080/ServicioWeb-SOAP')

if cliente.service.Login("Pame","Pame03"):
    print("Credenciales Correctas")
else:
    print("Credenciales Incorrectas")
        
if cliente.service.procesarPago(5000,100)>=0:
    print("Pago realizado")
else:
    print("Error al procesar el pago")