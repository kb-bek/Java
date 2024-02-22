package primitive_data_types;

public class PrimitiveDataTypes {
    public static void main(String[] args) {

        byte typeByte = 34;  //  -128 .. 127   Size - byte = 1, bit = 8;
        short typeShort = 22123;  // -32768 .. 32767  Size - byte = 2, bit = 16;
        int typeInt = 434553;  // -2*10^9 .. 2*10^9  Size - byte = 4, bit = 32;
        long typeLong = 4585432443243242323L; // -9*10^18 .. 9*10^18 Size - byte = 8, bit = 64;
        float typeFloat = 876.431f;  // -10^38 .. 10^38 Size - byte = 4, bit = 32;
        double typeDouble = 56422.234;  // -10^308 .. 10^308  Size - byte = 6, bit = 64;
        boolean typeBool = true || false; // true, false Size - byte = 1, bit = 8;
        char typeChar = '+'; // 0 .. 65,535 Size - byte = 2, bit = 16;

    }
}
