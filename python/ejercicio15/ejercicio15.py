from tkinter import *


def select():
    mostrar.config(text=f'Has selecionado la {opcion.get()}')
    
def atras():
    radopcion.set(None)
    mostrar.config(text="")


windows = Tk()
windows.geometry('400x400')

radopcion = StringVar()
lista = ['uno', 'dos', 'tres', 'cuatro']


listbox = Listbox(windows)
for i in lista:
	listbox.insert(END, i)
listbox.pack()


mostrar = Label(text = 'Hola label').pack()

windows.mainloop()
