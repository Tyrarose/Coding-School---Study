radius = float(input('Enter the radius of the circle: '))

area = 3.141592653589793*radius*radius

#area = "{:.2f}".format(area)

print("The area of a circle with "+ str(radius)+" is = "+ str(round(area, 3)))