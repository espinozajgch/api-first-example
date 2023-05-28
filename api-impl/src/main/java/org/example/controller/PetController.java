package org.example.controller;

import org.example.api.api_first_spec.controller.v1.PetApi;
import org.example.api.api_first_spec.dto.v1.ModelApiResponse;
import org.example.api.api_first_spec.dto.v1.Pet;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class PetController implements PetApi {
    @Override
    public ResponseEntity<Pet> addPet(Pet pet) {

        return null;
    }

    @Override
    public ResponseEntity<Void> deletePet(Long petId, String apiKey) {
        return null;
    }

    @Override
    public ResponseEntity<List<Pet>> findPetsByStatus(String status) {
        return null;
    }

    @Override
    public ResponseEntity<List<Pet>> findPetsByTags(List<String> tags) {
        return null;
    }

    @Override
    public ResponseEntity<Pet> getPetById(Long petId) {
        System.out.println("Hello world!");
        return null;
    }

    @Override
    public ResponseEntity<Pet> updatePet(Pet pet) {
        return null;
    }

    @Override
    public ResponseEntity<Void> updatePetWithForm(Long petId, String name, String status) {
        return null;
    }

    @Override
    public ResponseEntity<ModelApiResponse> uploadFile(Long petId, String additionalMetadata, Resource body) {
        return null;
    }
}
