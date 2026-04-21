void main() {
    Notepad myNotepad = new Notepad("John");
    myNotepad.addRecord("21.01.2026", "A new semester begins");
    myNotepad.addRecord("21.04.2026", "The semester is almost " +
            "over and I haven't gotten anything done yet.");
    myNotepad.printAll();
}