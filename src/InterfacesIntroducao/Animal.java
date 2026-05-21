// Pacote para introdução aos conceitos de interfaces em Java.
// Interfaces permitem definir contratos que classes devem implementar,
// promovendo abstração e polimorfismo sem herança múltipla.

package InterfacesIntroducao;

// Uma interface em Java é como um contrato: ela define métodos que devem ser implementados
// por qualquer classe que a "assine" (implemente). Interfaces não têm implementação concreta,
// apenas declarações de métodos. Elas são úteis para alcançar polimorfismo e desacoplamento.
public interface Animal {
    // Método abstrato que deve ser implementado pelas classes que implementam esta interface.
    // Note que não há corpo ({}), apenas a assinatura.
    void emitirsomeSom();
}
