from zeep import Client


client = Client('http://www.dneonline.com/calculator.asmx?WSDL')


result = client.service.Add(9, 6)
print('La suma es: ' + str(result))


result = client.service.Subtract(15, 5)
print('La resta es: ' + str(result))



result = client.service.Divide(8, 4)
print('La division es: ' + str(result))



result = client.service.Multiply(2, 9)
print('La multiplicacion es: ' + str(result))

