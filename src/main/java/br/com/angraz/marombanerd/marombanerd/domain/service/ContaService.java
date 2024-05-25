package br.com.angraz.marombanerd.marombanerd.domain.service;


import br.com.angraz.marombanerd.marombanerd.domain.exception.DomainExceptions;
import br.com.angraz.marombanerd.marombanerd.domain.model.Conta;
import br.com.angraz.marombanerd.marombanerd.domain.repository.ContaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Service
public class ContaService {


    private ContaRepository contaRepository;

    @Transactional
    public Conta salvar(Conta conta){
        boolean emailEmUso = contaRepository.findByEmail(conta.getEmail()).isPresent();

        if(emailEmUso){
            throw new DomainExceptions("Já Existe uma conta cadastrada  com esse email");
        }

        return contaRepository.save(conta);
    }
}
