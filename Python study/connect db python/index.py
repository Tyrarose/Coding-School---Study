import mysql.connector
conn = mysql.connector.connect(host='localhost', user='admin', password='admin',database='testdb')

my_cursor=conn.cursor()

conn.commit()
conn.close()