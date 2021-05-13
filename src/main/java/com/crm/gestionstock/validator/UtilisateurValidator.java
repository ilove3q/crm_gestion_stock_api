package com.crm.gestionstock.validator;

import com.crm.gestionstock.dto.UtilisateurDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class UtilisateurValidator {
    public static List<String> validate(UtilisateurDto utilisateurDto) {
        List<String> errors = new ArrayList<>();
        if (utilisateurDto == null) {
            errors.add("Veuillez renseigner le nom d'utilisateur");
            errors.add("Veuillez renseigner le prénom d'utilisateur");
            errors.add("Veuillez renseigner l'email d'utilisateur");
            errors.add("Veuillez renseigner le mot de passe d'utilisateur");
            errors.add("Veuillez renseigner le date de naissaince d'utilisateur");
            errors.add("Veuillez renseigner l'adresse d'utilisateur");
        } else {
            if (!StringUtils.hasLength(utilisateurDto.getNom())) {
                errors.add("Veuillez renseigner le nom d'utilisateur");
            }
            if (!StringUtils.hasLength(utilisateurDto.getPrenom())) {
                errors.add("Veuillez renseigner le prénom d'utilisateur");
            }
            if (!StringUtils.hasLength(utilisateurDto.getEmail())) {
                errors.add("Veuillez renseigner l'email d'utilisateur");
            }
            if (!StringUtils.hasLength(utilisateurDto.getMotDePasse())) {
                errors.add("Veuillez renseigner le mot de passe d'utilisateur");
            }
            if (utilisateurDto.getDateNaissance() == null) {
                errors.add("Veuillez renseigner le date de naissaince d'utilisateur");
            }

            if (utilisateurDto.getAdresse() == null) {
                errors.add("Veuillez renseigner l'adresse d'utilisateur");
            } else {
                if (!StringUtils.hasLength(utilisateurDto.getAdresse().getAdresse1())) {
                    errors.add("Le champs 'Adresse1' est obligatoire");
                }
                if (!StringUtils.hasLength(utilisateurDto.getAdresse().getVille())) {
                    errors.add("Le champs 'Vile' est obligatoire");
                }
                if (!StringUtils.hasLength(utilisateurDto.getAdresse().getCodePostale())) {
                    errors.add("Le champs 'Code postale' est obligatoire");
                }
                if (!StringUtils.hasLength(utilisateurDto.getAdresse().getPays())) {
                    errors.add("Le champs 'Pays' est obligatoire");
                }
            }
        }
        return errors;
    }
}
