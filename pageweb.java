// Sélectionner les sections cliquables
const section1 = document.getElementById("section1");
const section2 = document.getElementById("section2");

// Sélectionner la fenêtre popup et son contenu
const popup = document.getElementById("popup");
const popupContent = document.getElementById("popup-content");
const closeBtn = document.getElementById("close");

// Fonction pour afficher le contenu
function showPopup(content) {
    popupContent.innerHTML = content;
    popup.classList.remove("hidden");
}

// Ajouter des gestionnaires d'événements pour les sections
section1.addEventListener("click", () => {
    showPopup('<p>Voici le texte pour Section 1.</p><img src="https://via.placeholder.com/300" alt="Exemple d\'image">');
});

section2.addEventListener("click", () => {
    showPopup('<p>Voici un autre contenu pour Section 2.</p>');
});

// Fermer la fenêtre popup
closeBtn.addEventListener("click", () => {
    popup.classList.add("hidden");
});
// Sélectionner la section et la zone cachée
const section1 = document.getElementById("section1");
const hiddenContent = document.getElementById("hidden-content");

// Ajouter un gestionnaire d'événement pour afficher le contenu
section1.addEventListener("click", () => {
    hiddenContent.style.display = "block"; // Affiche le contenu
});