from tkinter import *


def select():
    mostrar.config(text=f'Has selecionado la {opcion.get()}')
    
def atras():
    radopcion.set(None)
    mostrar.config(text="")


windows = Tk()
windows.geometry('400x400')

radopcion = StringVar()
radopcion.set(None)

Radiobutton(windows, text='Opción 1', variable=radopcion, value='Opción 1', command=select).pack(anchor=W)
Radiobutton(windows, text='Opción 2', variable=radopcion, value='Opción 2', command=select).pack(anchor=W)
Radiobutton(windows, text='Opción 3', variable=radopcion, value='Opción 3', command=select).pack(anchor=W)
Radiobutton(windows, text='Opción 4', variable=radopcion, value='Opción 4', command=select).pack(anchor=W)
Radiobutton(windows, text='Opción 5', variable=radopcion, value='Opción 5', command=select).pack(anchor=W)


mostrar = Label(windows).pack()

Button(windows, text="Restablecer", command=atras).pack()

windows.mainloop()
