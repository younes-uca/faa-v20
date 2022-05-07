
// const root = environment.rootAppUrl;

import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { AuthGuard } from 'src/app/controller/guards/auth.guard';

import { LoginChercheurComponent } from './login-chercheur/login-chercheur.component';
import { RegisterChercheurComponent } from './register-chercheur/register-chercheur.component';

import { GestionEquipeDetailChercheurComponent } from './view/gestion-equipe-detail-chercheur/gestion-equipe-detail-chercheur.component';


import { LangueChercheurComponent } from './view/langue-chercheur/langue-chercheur.component';


import { OutilPedagogiquePubliqueCibleChercheurComponent } from './view/outil-pedagogique-publique-cible-chercheur/outil-pedagogique-publique-cible-chercheur.component';


import { StatusContratEtConventionChercheurComponent } from './view/status-contrat-et-convention-chercheur/status-contrat-et-convention-chercheur.component';


import { VilleChercheurComponent } from './view/ville-chercheur/ville-chercheur.component';


import { ResponsabilitePedagogiqueChercheurComponent } from './view/responsabilite-pedagogique-chercheur/responsabilite-pedagogique-chercheur.component';


import { ConseilEtComiteScientifiqueChercheurComponent } from './view/conseil-et-comite-scientifique-chercheur/conseil-et-comite-scientifique-chercheur.component';


import { DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirChercheurComponent } from './view/developpement-de-savoir-et-innovation-scientifique-communaute-savoir-chercheur/developpement-de-savoir-et-innovation-scientifique-communaute-savoir-chercheur.component';


import { FournisseurAppelProjetRechercheChercheurComponent } from './view/fournisseur-appel-projet-recherche-chercheur/fournisseur-appel-projet-recherche-chercheur.component';


import { GradeChercheurComponent } from './view/grade-chercheur/grade-chercheur.component';


import { TypeEtudeEnseignementChercheurComponent } from './view/type-etude-enseignement-chercheur/type-etude-enseignement-chercheur.component';


import { TypeOutilChercheurComponent } from './view/type-outil-chercheur/type-outil-chercheur.component';


import { SavoirEtInnovationChercheurComponent } from './view/savoir-et-innovation-chercheur/savoir-et-innovation-chercheur.component';

import { SavoirEtInnovationCreateChercheurComponent } from './view/savoir-et-innovation-chercheur/create-chercheur/savoir-et-innovation-create-chercheur.component';

import { DeveloppementDeSavoirEtInnovationScientifiqueChercheurComponent } from './view/developpement-de-savoir-et-innovation-scientifique-chercheur/developpement-de-savoir-et-innovation-scientifique-chercheur.component';


import { TypeEtudeChercheurComponent } from './view/type-etude-chercheur/type-etude-chercheur.component';


import { EnseignementZoneGeographiqueChercheurComponent } from './view/enseignement-zone-geographique-chercheur/enseignement-zone-geographique-chercheur.component';


import { IdentifiantAuteurExpertChercheurComponent } from './view/identifiant-auteur-expert-chercheur/identifiant-auteur-expert-chercheur.component';


import { CommunauteSavoirEncadrementDoctorantChercheurComponent } from './view/communaute-savoir-encadrement-doctorant-chercheur/communaute-savoir-encadrement-doctorant-chercheur.component';


import { SemanticRelationshipChercheurComponent } from './view/semantic-relationship-chercheur/semantic-relationship-chercheur.component';


import { ZoneActiviteInteractionRechercheChercheurComponent } from './view/zone-activite-interaction-recherche-chercheur/zone-activite-interaction-recherche-chercheur.component';


import { TypeExpertChercheurComponent } from './view/type-expert-chercheur/type-expert-chercheur.component';


import { DisciplineScientifiqueConseilsScientifiqueChercheurComponent } from './view/discipline-scientifique-conseils-scientifique-chercheur/discipline-scientifique-conseils-scientifique-chercheur.component';


import { VieInstitutionnelleChercheurComponent } from './view/vie-institutionnelle-chercheur/vie-institutionnelle-chercheur.component';

import { VieInstitutionnelleCreateChercheurComponent } from './view/vie-institutionnelle-chercheur/create-chercheur/vie-institutionnelle-create-chercheur.component';

import { CommunauteSavoirEncadrementEtudiantChercheurComponent } from './view/communaute-savoir-encadrement-etudiant-chercheur/communaute-savoir-encadrement-etudiant-chercheur.component';


import { StatusProjetChercheurComponent } from './view/status-projet-chercheur/status-projet-chercheur.component';


import { ModaliteChercheurComponent } from './view/modalite-chercheur/modalite-chercheur.component';


import { ConseilsScientifiqueChercheurComponent } from './view/conseils-scientifique-chercheur/conseils-scientifique-chercheur.component';


import { InstrumentsEtDispositifsIrdChercheurComponent } from './view/instruments-et-dispositifs-ird-chercheur/instruments-et-dispositifs-ird-chercheur.component';


import { NiveauFormationChercheurComponent } from './view/niveau-formation-chercheur/niveau-formation-chercheur.component';


import { EtatReclamationChercheurComponent } from './view/etat-reclamation-chercheur/etat-reclamation-chercheur.component';


import { NotificationChercheurComponent } from './view/notification-chercheur/notification-chercheur.component';


import { VieInstitutionnelleDetailEtablissementChercheurComponent } from './view/vie-institutionnelle-detail-etablissement-chercheur/vie-institutionnelle-detail-etablissement-chercheur.component';


import { OutilPedagogiqueInstrumentIrdChercheurComponent } from './view/outil-pedagogique-instrument-ird-chercheur/outil-pedagogique-instrument-ird-chercheur.component';


import { OutilPedagogiqueChercheurComponent } from './view/outil-pedagogique-chercheur/outil-pedagogique-chercheur.component';


import { TypeOutilPedagogiqueChercheurComponent } from './view/type-outil-pedagogique-chercheur/type-outil-pedagogique-chercheur.component';


import { InstrumentIrdChercheurComponent } from './view/instrument-ird-chercheur/instrument-ird-chercheur.component';


import { SexeChercheurComponent } from './view/sexe-chercheur/sexe-chercheur.component';


import { DisciplineScientifiqueChercheurChercheurComponent } from './view/discipline-scientifique-chercheur-chercheur/discipline-scientifique-chercheur-chercheur.component';


import { OutilPedagogiquePaysDiffusionChercheurComponent } from './view/outil-pedagogique-pays-diffusion-chercheur/outil-pedagogique-pays-diffusion-chercheur.component';


import { RencontreMediaDisciplineScientifiqueChercheurComponent } from './view/rencontre-media-discipline-scientifique-chercheur/rencontre-media-discipline-scientifique-chercheur.component';


import { CommunauteSavoirEvenementColloqueScientifiqueChercheurComponent } from './view/communaute-savoir-evenement-colloque-scientifique-chercheur/communaute-savoir-evenement-colloque-scientifique-chercheur.component';


import { VieInstitutionnelleDetailChercheurComponent } from './view/vie-institutionnelle-detail-chercheur/vie-institutionnelle-detail-chercheur.component';


import { PubliqueFormationChercheurComponent } from './view/publique-formation-chercheur/publique-formation-chercheur.component';


import { EtudiantChercheurComponent } from './view/etudiant-chercheur/etudiant-chercheur.component';


import { FormatRencontreChercheurComponent } from './view/format-rencontre-chercheur/format-rencontre-chercheur.component';


import { NiveauResponsabilitePedagogiqueChercheurComponent } from './view/niveau-responsabilite-pedagogique-chercheur/niveau-responsabilite-pedagogique-chercheur.component';


import { ZoneGeographiqueConseilsScientifiqueChercheurComponent } from './view/zone-geographique-conseils-scientifique-chercheur/zone-geographique-conseils-scientifique-chercheur.component';


import { EnjeuxIrdChercheurComponent } from './view/enjeux-ird-chercheur/enjeux-ird-chercheur.component';


import { EtablissementConsultanceScientifiquePonctuelleChercheurComponent } from './view/etablissement-consultance-scientifique-ponctuelle-chercheur/etablissement-consultance-scientifique-ponctuelle-chercheur.component';


import { CampagneRelanceChercheurChercheurComponent } from './view/campagne-relance-chercheur-chercheur/campagne-relance-chercheur-chercheur.component';


import { ContratEtConventionIrdChercheurComponent } from './view/contrat-et-convention-ird-chercheur/contrat-et-convention-ird-chercheur.component';


import { PubliqueProfessionelChercheurComponent } from './view/publique-professionel-chercheur/publique-professionel-chercheur.component';


import { ProjetActiviteRechercheDetailPaysChercheurComponent } from './view/projet-activite-recherche-detail-pays-chercheur/projet-activite-recherche-detail-pays-chercheur.component';


import { RencontreGrandPubliqueJeunePubliquePeriodeChercheurComponent } from './view/rencontre-grand-publique-jeune-publique-periode-chercheur/rencontre-grand-publique-jeune-publique-periode-chercheur.component';


import { PaysFormationContinueChercheurComponent } from './view/pays-formation-continue-chercheur/pays-formation-continue-chercheur.component';


import { VieInstitutionnelleDetailInstrumentIrdChercheurComponent } from './view/vie-institutionnelle-detail-instrument-ird-chercheur/vie-institutionnelle-detail-instrument-ird-chercheur.component';


import { DisciplineScientifiqueErcChercheurComponent } from './view/discipline-scientifique-erc-chercheur/discipline-scientifique-erc-chercheur.component';


import { EvenementColloqueScienntifiqueEnjeuxIrdChercheurComponent } from './view/evenement-colloque-scienntifique-enjeux-ird-chercheur/evenement-colloque-scienntifique-enjeux-ird-chercheur.component';


import { CultureScientifiqueChercheurComponent } from './view/culture-scientifique-chercheur/culture-scientifique-chercheur.component';

import { CultureScientifiqueCreateChercheurComponent } from './view/culture-scientifique-chercheur/create-chercheur/culture-scientifique-create-chercheur.component';

import { EnseignementChercheurComponent } from './view/enseignement-chercheur/enseignement-chercheur.component';


import { PaysZoneGeographiqueChercheurComponent } from './view/pays-zone-geographique-chercheur/pays-zone-geographique-chercheur.component';


import { RoleProjetChercheurComponent } from './view/role-projet-chercheur/role-projet-chercheur.component';


import { ResponsabiliteDirectionEncadrementEtudiantChercheurComponent } from './view/responsabilite-direction-encadrement-etudiant-chercheur/responsabilite-direction-encadrement-etudiant-chercheur.component';


import { EncadrementEtudiantChercheurComponent } from './view/encadrement-etudiant-chercheur/encadrement-etudiant-chercheur.component';


import { CaracterisationChercheurComponent } from './view/caracterisation-chercheur/caracterisation-chercheur.component';


import { EtablissementProjetChercheurComponent } from './view/etablissement-projet-chercheur/etablissement-projet-chercheur.component';


import { ContexteChercheurComponent } from './view/contexte-chercheur/contexte-chercheur.component';


import { KeyWordChercheurComponent } from './view/key-word-chercheur/key-word-chercheur.component';


import { EnjeuxIrdComiteEtCommissionEvaluationChercheurComponent } from './view/enjeux-ird-comite-et-commission-evaluation-chercheur/enjeux-ird-comite-et-commission-evaluation-chercheur.component';


import { TypeExpertiseEvaluationComiteEtCommissionEvaluationChercheurComponent } from './view/type-expertise-evaluation-comite-et-commission-evaluation-chercheur/type-expertise-evaluation-comite-et-commission-evaluation-chercheur.component';


import { RencontreMediaChercheurComponent } from './view/rencontre-media-chercheur/rencontre-media-chercheur.component';


import { NiveauEtudeChercheurComponent } from './view/niveau-etude-chercheur/niveau-etude-chercheur.component';


import { EntiteAdministrativeChercheurComponent } from './view/entite-administrative-chercheur/entite-administrative-chercheur.component';


import { ReclamationChercheurComponent } from './view/reclamation-chercheur/reclamation-chercheur.component';


import { EncadrementEtudiantEnjeuxIrdChercheurComponent } from './view/encadrement-etudiant-enjeux-ird-chercheur/encadrement-etudiant-enjeux-ird-chercheur.component';


import { ProjetActiviteRechercheDetailEtablissementLanceurChercheurComponent } from './view/projet-activite-recherche-detail-etablissement-lanceur-chercheur/projet-activite-recherche-detail-etablissement-lanceur-chercheur.component';


import { CampagneRappelChercheurComponent } from './view/campagne-rappel-chercheur/campagne-rappel-chercheur.component';


import { DisciplineScientifiqueEvenementColloqueScientifiqueChercheurComponent } from './view/discipline-scientifique-evenement-colloque-scientifique-chercheur/discipline-scientifique-evenement-colloque-scientifique-chercheur.component';


import { DisciplineScientifiqueParentChercheurComponent } from './view/discipline-scientifique-parent-chercheur/discipline-scientifique-parent-chercheur.component';


import { TemplateOuvertureChercheurComponent } from './view/template-ouverture-chercheur/template-ouverture-chercheur.component';


import { NatureExpertiseChercheurComponent } from './view/nature-expertise-chercheur/nature-expertise-chercheur.component';


import { StatusCursusChercheurComponent } from './view/status-cursus-chercheur/status-cursus-chercheur.component';


import { OutilPedagogiqueDisciplineScientifiqueChercheurComponent } from './view/outil-pedagogique-discipline-scientifique-chercheur/outil-pedagogique-discipline-scientifique-chercheur.component';


import { CampagneRappelChercheurChercheurComponent } from './view/campagne-rappel-chercheur-chercheur/campagne-rappel-chercheur-chercheur.component';


import { ModaliteFormationContinueChercheurComponent } from './view/modalite-formation-continue-chercheur/modalite-formation-continue-chercheur.component';


import { IdentifiantRechercheChercheurComponent } from './view/identifiant-recherche-chercheur/identifiant-recherche-chercheur.component';


import { EncadrementChercheurComponent } from './view/encadrement-chercheur/encadrement-chercheur.component';

import { EncadrementCreateChercheurComponent } from './view/encadrement-chercheur/create-chercheur/encadrement-create-chercheur.component';

import { EnjeuxIrdConseilsScientifiqueChercheurComponent } from './view/enjeux-ird-conseils-scientifique-chercheur/enjeux-ird-conseils-scientifique-chercheur.component';


import { DisciplineScientifiqueConsultanceScientifiquePonctuelleChercheurComponent } from './view/discipline-scientifique-consultance-scientifique-ponctuelle-chercheur/discipline-scientifique-consultance-scientifique-ponctuelle-chercheur.component';


import { FormationContinuePubliqueProfessionelChercheurComponent } from './view/formation-continue-publique-professionel-chercheur/formation-continue-publique-professionel-chercheur.component';


import { DisciplineScientifiqueErcAssociationChercheurComponent } from './view/discipline-scientifique-erc-association-chercheur/discipline-scientifique-erc-association-chercheur.component';


import { EnseignementEnjeuxIrdChercheurComponent } from './view/enseignement-enjeux-ird-chercheur/enseignement-enjeux-ird-chercheur.component';


import { InstrumentIrdComiteEtCommissionEvaluationChercheurComponent } from './view/instrument-ird-comite-et-commission-evaluation-chercheur/instrument-ird-comite-et-commission-evaluation-chercheur.component';


import { DisciplineScientifiqueConseilEtComiteScientifiqueChercheurComponent } from './view/discipline-scientifique-conseil-et-comite-scientifique-chercheur/discipline-scientifique-conseil-et-comite-scientifique-chercheur.component';


import { EtatEtapeCampagneChercheurComponent } from './view/etat-etape-campagne-chercheur/etat-etape-campagne-chercheur.component';


import { ProjetActiviteRechercheDetailChercheurComponent } from './view/projet-activite-recherche-detail-chercheur/projet-activite-recherche-detail-chercheur.component';


import { StructureIrdChercheurComponent } from './view/structure-ird-chercheur/structure-ird-chercheur.component';


import { ExpertiseChercheurComponent } from './view/expertise-chercheur/expertise-chercheur.component';

import { ExpertiseCreateChercheurComponent } from './view/expertise-chercheur/create-chercheur/expertise-create-chercheur.component';

import { TypePubliqueChercheurComponent } from './view/type-publique-chercheur/type-publique-chercheur.component';


import { CampagneChercheurOuvertureChercheurComponent } from './view/campagne-chercheur-ouverture-chercheur/campagne-chercheur-ouverture-chercheur.component';


import { NatureEnseignementChercheurComponent } from './view/nature-enseignement-chercheur/nature-enseignement-chercheur.component';


import { EnjeuxIrdConsultanceScientifiquePonctuelleChercheurComponent } from './view/enjeux-ird-consultance-scientifique-ponctuelle-chercheur/enjeux-ird-consultance-scientifique-ponctuelle-chercheur.component';


import { TypeUtilisateurChercheurComponent } from './view/type-utilisateur-chercheur/type-utilisateur-chercheur.component';


import { EtablissementComiteEtCommissionEvaluationChercheurComponent } from './view/etablissement-comite-et-commission-evaluation-chercheur/etablissement-comite-et-commission-evaluation-chercheur.component';


import { DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusionChercheurComponent } from './view/developpement-de-savoir-et-innovation-scientifique-mode-diffusion-chercheur/developpement-de-savoir-et-innovation-scientifique-mode-diffusion-chercheur.component';


import { MasterInternationalChercheurComponent } from './view/master-international-chercheur/master-international-chercheur.component';


import { ResponsabilitePedagogiqueEnjeuxIrdChercheurComponent } from './view/responsabilite-pedagogique-enjeux-ird-chercheur/responsabilite-pedagogique-enjeux-ird-chercheur.component';


import { FaqChercheurComponent } from './view/faq-chercheur/faq-chercheur.component';


import { FinancementDoctorantChercheurComponent } from './view/financement-doctorant-chercheur/financement-doctorant-chercheur.component';


import { ExpertiseScientifiqueChercheurComponent } from './view/expertise-scientifique-chercheur/expertise-scientifique-chercheur.component';

import { ExpertiseScientifiqueCreateChercheurComponent } from './view/expertise-scientifique-chercheur/create-chercheur/expertise-scientifique-create-chercheur.component';

import { EtablissementEnseignementChercheurComponent } from './view/etablissement-enseignement-chercheur/etablissement-enseignement-chercheur.component';


import { OutilPedagogiquePaysConceptionChercheurComponent } from './view/outil-pedagogique-pays-conception-chercheur/outil-pedagogique-pays-conception-chercheur.component';


import { TypePubliqueCultureScientifiqueChercheurComponent } from './view/type-publique-culture-scientifique-chercheur/type-publique-culture-scientifique-chercheur.component';


import { CampagneChercheurFermetureChercheurComponent } from './view/campagne-chercheur-fermeture-chercheur/campagne-chercheur-fermeture-chercheur.component';


import { EncadrementDoctorantChercheurComponent } from './view/encadrement-doctorant-chercheur/encadrement-doctorant-chercheur.component';


import { CommunauteSavoirConseilEtComiteScientifiqueChercheurComponent } from './view/communaute-savoir-conseil-et-comite-scientifique-chercheur/communaute-savoir-conseil-et-comite-scientifique-chercheur.component';


import { TemplateClotureChercheurComponent } from './view/template-cloture-chercheur/template-cloture-chercheur.component';


import { OutilPedagogiqueTypeInstrumentIrdChercheurComponent } from './view/outil-pedagogique-type-instrument-ird-chercheur/outil-pedagogique-type-instrument-ird-chercheur.component';


import { EtablissementChercheurComponent } from './view/etablissement-chercheur/etablissement-chercheur.component';


import { CommanditaireChercheurComponent } from './view/commanditaire-chercheur/commanditaire-chercheur.component';


import { DisciplineScientifiqueErcParentChercheurComponent } from './view/discipline-scientifique-erc-parent-chercheur/discipline-scientifique-erc-parent-chercheur.component';


import { DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueChercheurComponent } from './view/developpement-de-savoir-et-innovation-scientifique-discipline-scientifique-chercheur/developpement-de-savoir-et-innovation-scientifique-discipline-scientifique-chercheur.component';


import { RoleComiteEtCommissionEvaluationChercheurComponent } from './view/role-comite-et-commission-evaluation-chercheur/role-comite-et-commission-evaluation-chercheur.component';


import { NiveauFormationPostBacChercheurComponent } from './view/niveau-formation-post-bac-chercheur/niveau-formation-post-bac-chercheur.component';


import { ChercheurEmailChercheurComponent } from './view/chercheur-email-chercheur/chercheur-email-chercheur.component';


import { EnjeuxIrdChercheurChercheurComponent } from './view/enjeux-ird-chercheur-chercheur/enjeux-ird-chercheur-chercheur.component';


import { TypeEntiteAdministrativeChercheurComponent } from './view/type-entite-administrative-chercheur/type-entite-administrative-chercheur.component';


import { ProjetActiviteRechercheDetailEnjeuxIrdChercheurComponent } from './view/projet-activite-recherche-detail-enjeux-ird-chercheur/projet-activite-recherche-detail-enjeux-ird-chercheur.component';


import { TypePubliqueRencontreGrandPubliqueJeunePubliqueChercheurComponent } from './view/type-publique-rencontre-grand-publique-jeune-publique-chercheur/type-publique-rencontre-grand-publique-jeune-publique-chercheur.component';


import { EnseignementDisciplineScientifiqueChercheurComponent } from './view/enseignement-discipline-scientifique-chercheur/enseignement-discipline-scientifique-chercheur.component';


import { KeyWordDisciplineScientifiqueErcChercheurComponent } from './view/key-word-discipline-scientifique-erc-chercheur/key-word-discipline-scientifique-erc-chercheur.component';


import { CommunauteSavoirChercheurChercheurComponent } from './view/communaute-savoir-chercheur-chercheur/communaute-savoir-chercheur-chercheur.component';


import { CategorieFaqChercheurComponent } from './view/categorie-faq-chercheur/categorie-faq-chercheur.component';


import { ComiteEtCommissionEvaluationChercheurComponent } from './view/comite-et-commission-evaluation-chercheur/comite-et-commission-evaluation-chercheur.component';


import { ModaliteEtudeChercheurComponent } from './view/modalite-etude-chercheur/modalite-etude-chercheur.component';


import { EvenementColloqueScienntifiqueChercheurComponent } from './view/evenement-colloque-scienntifique-chercheur/evenement-colloque-scienntifique-chercheur.component';


import { FormationContinueObjetFormationGeneriqueChercheurComponent } from './view/formation-continue-objet-formation-generique-chercheur/formation-continue-objet-formation-generique-chercheur.component';


import { FormationContinueChercheurComponent } from './view/formation-continue-chercheur/formation-continue-chercheur.component';


import { ProjetActiviteRechercheDetailInstitutionCoContractantChercheurComponent } from './view/projet-activite-recherche-detail-institution-co-contractant-chercheur/projet-activite-recherche-detail-institution-co-contractant-chercheur.component';


import { ConsultanceScientifiquePonctuelleChercheurComponent } from './view/consultance-scientifique-ponctuelle-chercheur/consultance-scientifique-ponctuelle-chercheur.component';


import { ModaliteInterventionChercheurComponent } from './view/modalite-intervention-chercheur/modalite-intervention-chercheur.component';


import { ZoneGeographiqueFormationContinueChercheurComponent } from './view/zone-geographique-formation-continue-chercheur/zone-geographique-formation-continue-chercheur.component';


import { ProjetActiviteRechercheDetailInstrumentIrdChercheurComponent } from './view/projet-activite-recherche-detail-instrument-ird-chercheur/projet-activite-recherche-detail-instrument-ird-chercheur.component';


import { RencontreGrandPubliqueJeunePubliqueInstrumentIrdChercheurComponent } from './view/rencontre-grand-publique-jeune-publique-instrument-ird-chercheur/rencontre-grand-publique-jeune-publique-instrument-ird-chercheur.component';


import { TypeInstrumentIrdConsultanceScientifiquePonctuelleChercheurComponent } from './view/type-instrument-ird-consultance-scientifique-ponctuelle-chercheur/type-instrument-ird-consultance-scientifique-ponctuelle-chercheur.component';


import { NatureActiviteGrandPubliqueChercheurComponent } from './view/nature-activite-grand-publique-chercheur/nature-activite-grand-publique-chercheur.component';


import { DeveloppementDeSavoirEtInnovationScientifiquePaysChercheurComponent } from './view/developpement-de-savoir-et-innovation-scientifique-pays-chercheur/developpement-de-savoir-et-innovation-scientifique-pays-chercheur.component';


import { ZoneGeographiqueChercheurComponent } from './view/zone-geographique-chercheur/zone-geographique-chercheur.component';


import { CommissionScientifiqueChercheurComponent } from './view/commission-scientifique-chercheur/commission-scientifique-chercheur.component';


import { RoleDeveloppementDeSavoirChercheurComponent } from './view/role-developpement-de-savoir-chercheur/role-developpement-de-savoir-chercheur.component';


import { TypeUtilisateurSavoirConcuChercheurComponent } from './view/type-utilisateur-savoir-concu-chercheur/type-utilisateur-savoir-concu-chercheur.component';


import { NatureEtudeChercheurComponent } from './view/nature-etude-chercheur/nature-etude-chercheur.component';


import { EncadrementEtudiantDisciplineScientifiqueChercheurComponent } from './view/encadrement-etudiant-discipline-scientifique-chercheur/encadrement-etudiant-discipline-scientifique-chercheur.component';


import { CommunauteSavoirExpertiseScientifiqueChercheurComponent } from './view/communaute-savoir-expertise-scientifique-chercheur/communaute-savoir-expertise-scientifique-chercheur.component';


import { TemplateRappelChercheurComponent } from './view/template-rappel-chercheur/template-rappel-chercheur.component';


import { TypeReclamationChercheurComponent } from './view/type-reclamation-chercheur/type-reclamation-chercheur.component';


import { DisciplineScientifiqueComiteEtCommissionEvaluationChercheurComponent } from './view/discipline-scientifique-comite-et-commission-evaluation-chercheur/discipline-scientifique-comite-et-commission-evaluation-chercheur.component';


import { TypeInstrumentIrdChercheurComponent } from './view/type-instrument-ird-chercheur/type-instrument-ird-chercheur.component';


import { DistinctionEtablissementPaysChercheurComponent } from './view/distinction-etablissement-pays-chercheur/distinction-etablissement-pays-chercheur.component';


import { InstrumentIrdChercheurChercheurComponent } from './view/instrument-ird-chercheur-chercheur/instrument-ird-chercheur-chercheur.component';


import { RencontreGrandPubliqueJeunePubliqueEnjeuxIrdChercheurComponent } from './view/rencontre-grand-publique-jeune-publique-enjeux-ird-chercheur/rencontre-grand-publique-jeune-publique-enjeux-ird-chercheur.component';


import { DisciplineScientifiqueChercheurComponent } from './view/discipline-scientifique-chercheur/discipline-scientifique-chercheur.component';


import { TypeExpertiseChercheurComponent } from './view/type-expertise-chercheur/type-expertise-chercheur.component';


import { DoctorantChercheurComponent } from './view/doctorant-chercheur/doctorant-chercheur.component';


import { CorpsChercheurComponent } from './view/corps-chercheur/corps-chercheur.component';


import { EnseignementEtFormationChercheurComponent } from './view/enseignement-et-formation-chercheur/enseignement-et-formation-chercheur.component';

import { EnseignementEtFormationCreateChercheurComponent } from './view/enseignement-et-formation-chercheur/create-chercheur/enseignement-et-formation-create-chercheur.component';

import { DepartementScientifiqueChercheurComponent } from './view/departement-scientifique-chercheur/departement-scientifique-chercheur.component';


import { PaysOrganisateurRencontreGrandPubliqueJeunePubliqueChercheurComponent } from './view/pays-organisateur-rencontre-grand-publique-jeune-publique-chercheur/pays-organisateur-rencontre-grand-publique-jeune-publique-chercheur.component';


import { CommunauteSavoirChercheurComponent } from './view/communaute-savoir-chercheur/communaute-savoir-chercheur.component';


import { DisciplineScientifiqueExpertiseScientifiqueChercheurComponent } from './view/discipline-scientifique-expertise-scientifique-chercheur/discipline-scientifique-expertise-scientifique-chercheur.component';


import { OutilPedagogiqueEnjeuxIrdChercheurComponent } from './view/outil-pedagogique-enjeux-ird-chercheur/outil-pedagogique-enjeux-ird-chercheur.component';


import { ResponsabiliteEncadrementDoctorantChercheurComponent } from './view/responsabilite-encadrement-doctorant-chercheur/responsabilite-encadrement-doctorant-chercheur.component';


import { RencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueChercheurComponent } from './view/rencontre-grand-publique-jeune-publique-discipline-scientifique-chercheur/rencontre-grand-publique-jeune-publique-discipline-scientifique-chercheur.component';


import { GestionEquipeChercheurComponent } from './view/gestion-equipe-chercheur/gestion-equipe-chercheur.component';

import { GestionEquipeCreateChercheurComponent } from './view/gestion-equipe-chercheur/create-chercheur/gestion-equipe-create-chercheur.component';

import { DistinctionChercheurComponent } from './view/distinction-chercheur/distinction-chercheur.component';

import { DistinctionCreateChercheurComponent } from './view/distinction-chercheur/create-chercheur/distinction-create-chercheur.component';

import { CampagneRelanceChercheurComponent } from './view/campagne-relance-chercheur/campagne-relance-chercheur.component';


import { RencontreMediaEnjeuxIrdChercheurComponent } from './view/rencontre-media-enjeux-ird-chercheur/rencontre-media-enjeux-ird-chercheur.component';


import { ResponsabilitePedagogiquePaysChercheurComponent } from './view/responsabilite-pedagogique-pays-chercheur/responsabilite-pedagogique-pays-chercheur.component';


import { TypePubliqueRencontreMediaChercheurComponent } from './view/type-publique-rencontre-media-chercheur/type-publique-rencontre-media-chercheur.component';


import { FormationContinueEnjeuxIrdChercheurComponent } from './view/formation-continue-enjeux-ird-chercheur/formation-continue-enjeux-ird-chercheur.component';


import { ZoneGeographiqueConsultanceScientifiquePonctuelleChercheurComponent } from './view/zone-geographique-consultance-scientifique-ponctuelle-chercheur/zone-geographique-consultance-scientifique-ponctuelle-chercheur.component';


import { RencontreMediaPeriodeChercheurComponent } from './view/rencontre-media-periode-chercheur/rencontre-media-periode-chercheur.component';


import { PaysRencontreGrandPubliqueJeunePubliqueChercheurComponent } from './view/pays-rencontre-grand-publique-jeune-publique-chercheur/pays-rencontre-grand-publique-jeune-publique-chercheur.component';


import { CommunauteSavoirProjetActiviteRechercheChercheurComponent } from './view/communaute-savoir-projet-activite-recherche-chercheur/communaute-savoir-projet-activite-recherche-chercheur.component';


import { PaysChercheurComponent } from './view/pays-chercheur/pays-chercheur.component';


import { OutilPedagogiqueLangueChercheurComponent } from './view/outil-pedagogique-langue-chercheur/outil-pedagogique-langue-chercheur.component';


import { InstrumentIrdConsultanceScientifiquePonctuelleChercheurComponent } from './view/instrument-ird-consultance-scientifique-ponctuelle-chercheur/instrument-ird-consultance-scientifique-ponctuelle-chercheur.component';


import { ProjetActiviteRechercheChercheurComponent } from './view/projet-activite-recherche-chercheur/projet-activite-recherche-chercheur.component';

import { ProjetActiviteRechercheCreateChercheurComponent } from './view/projet-activite-recherche-chercheur/create-chercheur/projet-activite-recherche-create-chercheur.component';

import { ResponsabilitePedagogiqueEtablissementChercheurComponent } from './view/responsabilite-pedagogique-etablissement-chercheur/responsabilite-pedagogique-etablissement-chercheur.component';


import { DeveloppementDeSavoirEtInnovationScientifiqueEtablissementChercheurComponent } from './view/developpement-de-savoir-et-innovation-scientifique-etablissement-chercheur/developpement-de-savoir-et-innovation-scientifique-etablissement-chercheur.component';


import { TypeInstanceChercheurComponent } from './view/type-instance-chercheur/type-instance-chercheur.component';


import { ModeDiffusionChercheurComponent } from './view/mode-diffusion-chercheur/mode-diffusion-chercheur.component';


import { ObjetFormationGeneriqueDeResponsabilitePedagogiqueChercheurComponent } from './view/objet-formation-generique-de-responsabilite-pedagogique-chercheur/objet-formation-generique-de-responsabilite-pedagogique-chercheur.component';


import { TypeInstrumentIrdChercheurChercheurComponent } from './view/type-instrument-ird-chercheur-chercheur/type-instrument-ird-chercheur-chercheur.component';


import { TemplateRelanceChercheurComponent } from './view/template-relance-chercheur/template-relance-chercheur.component';


import { EtablissementPartenaireChercheurComponent } from './view/etablissement-partenaire-chercheur/etablissement-partenaire-chercheur.component';


import { DisciplineScientifiqueEncadrementDoctorantChercheurComponent } from './view/discipline-scientifique-encadrement-doctorant-chercheur/discipline-scientifique-encadrement-doctorant-chercheur.component';


import { PaysRencontreMediaChercheurComponent } from './view/pays-rencontre-media-chercheur/pays-rencontre-media-chercheur.component';


import { RoleEvaluationChercheurComponent } from './view/role-evaluation-chercheur/role-evaluation-chercheur.component';


import { RencontreGrandPubliqueJeunePubliqueChercheurComponent } from './view/rencontre-grand-publique-jeune-publique-chercheur/rencontre-grand-publique-jeune-publique-chercheur.component';


import { TypeParticipationChercheurComponent } from './view/type-participation-chercheur/type-participation-chercheur.component';


import { EvenementColloqueScienntifiquePaysChercheurComponent } from './view/evenement-colloque-scienntifique-pays-chercheur/evenement-colloque-scienntifique-pays-chercheur.component';


import { TypeExpertiseEvaluationChercheurComponent } from './view/type-expertise-evaluation-chercheur/type-expertise-evaluation-chercheur.component';


import { EtatCampagneChercheurComponent } from './view/etat-campagne-chercheur/etat-campagne-chercheur.component';


import { TypeSavoirChercheurComponent } from './view/type-savoir-chercheur/type-savoir-chercheur.component';


import { DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrdChercheurComponent } from './view/developpement-de-savoir-et-innovation-scientifique-enjeux-ird-chercheur/developpement-de-savoir-et-innovation-scientifique-enjeux-ird-chercheur.component';


import { InstitutionChercheurComponent } from './view/institution-chercheur/institution-chercheur.component';


import { StructureOganisatriceChercheurComponent } from './view/structure-oganisatrice-chercheur/structure-oganisatrice-chercheur.component';


import { DisciplineScientifiqueEncadrementEtudiantChercheurComponent } from './view/discipline-scientifique-encadrement-etudiant-chercheur/discipline-scientifique-encadrement-etudiant-chercheur.component';


import { FormationContinueCommanditaireChercheurComponent } from './view/formation-continue-commanditaire-chercheur/formation-continue-commanditaire-chercheur.component';


import { AffectationStructurelleChercheurComponent } from './view/affectation-structurelle-chercheur/affectation-structurelle-chercheur.component';


import { CaracterisationDeveloppementDeSavoirEtInnovationScientifiqueChercheurComponent } from './view/caracterisation-developpement-de-savoir-et-innovation-scientifique-chercheur/caracterisation-developpement-de-savoir-et-innovation-scientifique-chercheur.component';


import { PubliqueCibleChercheurComponent } from './view/publique-cible-chercheur/publique-cible-chercheur.component';


import { NationaliteChercheurComponent } from './view/nationalite-chercheur/nationalite-chercheur.component';


import { PaysCommanditaireChercheurComponent } from './view/pays-commanditaire-chercheur/pays-commanditaire-chercheur.component';


import { RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdChercheurComponent } from './view/rencontre-grand-publique-jeune-publique-type-instrument-ird-chercheur/rencontre-grand-publique-jeune-publique-type-instrument-ird-chercheur.component';


import { TypeEnseignementChercheurComponent } from './view/type-enseignement-chercheur/type-enseignement-chercheur.component';


import { FormationContinueDisciplineScientifiqueChercheurComponent } from './view/formation-continue-discipline-scientifique-chercheur/formation-continue-discipline-scientifique-chercheur.component';


import { EnjeuxIrdEncadrementDoctorantChercheurComponent } from './view/enjeux-ird-encadrement-doctorant-chercheur/enjeux-ird-encadrement-doctorant-chercheur.component';


import { EnseignementNatureChercheurComponent } from './view/enseignement-nature-chercheur/enseignement-nature-chercheur.component';


import { TypeSavoirDeveloppementDeSavoirEtInnovationScientifiqueChercheurComponent } from './view/type-savoir-developpement-de-savoir-et-innovation-scientifique-chercheur/type-savoir-developpement-de-savoir-et-innovation-scientifique-chercheur.component';


import { NiveauEtudeEnseignementChercheurComponent } from './view/niveau-etude-enseignement-chercheur/niveau-etude-enseignement-chercheur.component';


import { CategorieNotificationChercheurComponent } from './view/categorie-notification-chercheur/categorie-notification-chercheur.component';


import { ChercheurChercheurComponent } from './view/chercheur-chercheur/chercheur-chercheur.component';


import { EtablissementConseilsScientifiqueChercheurComponent } from './view/etablissement-conseils-scientifique-chercheur/etablissement-conseils-scientifique-chercheur.component';


import { CampagneChercheurComponent } from './view/campagne-chercheur/campagne-chercheur.component';


import { EtatCampagneChercheurChercheurComponent } from './view/etat-campagne-chercheur-chercheur/etat-campagne-chercheur-chercheur.component';


import { ObjetFormationGeneriqueChercheurComponent } from './view/objet-formation-generique-chercheur/objet-formation-generique-chercheur.component';


@NgModule({
    imports: [
        RouterModule.forChild(
            [
                {
                    path: '',
                    children: [
                        {
                            path: 'login',
                            children: [
                                {
                                    path: '',
                                    component: LoginChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                              ]
                        },
                        {
                            path: 'register',
                            children: [
                                {
                                    path: '',
                                    component: RegisterChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                              ]
                        },
                        {

                            path: 'gestion-equipe-detail',
                            children: [
                                {
                                    path: 'list',
                                    component: GestionEquipeDetailChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'langue',
                            children: [
                                {
                                    path: 'list',
                                    component: LangueChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'outil-pedagogique-publique-cible',
                            children: [
                                {
                                    path: 'list',
                                    component: OutilPedagogiquePubliqueCibleChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'status-contrat-et-convention',
                            children: [
                                {
                                    path: 'list',
                                    component: StatusContratEtConventionChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'ville',
                            children: [
                                {
                                    path: 'list',
                                    component: VilleChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'responsabilite-pedagogique',
                            children: [
                                {
                                    path: 'list',
                                    component: ResponsabilitePedagogiqueChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'conseil-et-comite-scientifique',
                            children: [
                                {
                                    path: 'list',
                                    component: ConseilEtComiteScientifiqueChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'developpement-de-savoir-et-innovation-scientifique-communaute-savoir',
                            children: [
                                {
                                    path: 'list',
                                    component: DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'fournisseur-appel-projet-recherche',
                            children: [
                                {
                                    path: 'list',
                                    component: FournisseurAppelProjetRechercheChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'grade',
                            children: [
                                {
                                    path: 'list',
                                    component: GradeChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'type-etude-enseignement',
                            children: [
                                {
                                    path: 'list',
                                    component: TypeEtudeEnseignementChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'type-outil',
                            children: [
                                {
                                    path: 'list',
                                    component: TypeOutilChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'savoir-et-innovation',
                            children: [
                                {
                                    path: 'list',
                                    component: SavoirEtInnovationChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                                 ,{
                                    path: 'create',
                                    component: SavoirEtInnovationCreateChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'developpement-de-savoir-et-innovation-scientifique',
                            children: [
                                {
                                    path: 'list',
                                    component: DeveloppementDeSavoirEtInnovationScientifiqueChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'type-etude',
                            children: [
                                {
                                    path: 'list',
                                    component: TypeEtudeChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'enseignement-zone-geographique',
                            children: [
                                {
                                    path: 'list',
                                    component: EnseignementZoneGeographiqueChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'identifiant-auteur-expert',
                            children: [
                                {
                                    path: 'list',
                                    component: IdentifiantAuteurExpertChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'communaute-savoir-encadrement-doctorant',
                            children: [
                                {
                                    path: 'list',
                                    component: CommunauteSavoirEncadrementDoctorantChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'semantic-relationship',
                            children: [
                                {
                                    path: 'list',
                                    component: SemanticRelationshipChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'zone-activite-interaction-recherche',
                            children: [
                                {
                                    path: 'list',
                                    component: ZoneActiviteInteractionRechercheChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'type-expert',
                            children: [
                                {
                                    path: 'list',
                                    component: TypeExpertChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'discipline-scientifique-conseils-scientifique',
                            children: [
                                {
                                    path: 'list',
                                    component: DisciplineScientifiqueConseilsScientifiqueChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'vie-institutionnelle',
                            children: [
                                {
                                    path: 'list',
                                    component: VieInstitutionnelleChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                                 ,{
                                    path: 'create',
                                    component: VieInstitutionnelleCreateChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'communaute-savoir-encadrement-etudiant',
                            children: [
                                {
                                    path: 'list',
                                    component: CommunauteSavoirEncadrementEtudiantChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'status-projet',
                            children: [
                                {
                                    path: 'list',
                                    component: StatusProjetChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'modalite',
                            children: [
                                {
                                    path: 'list',
                                    component: ModaliteChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'conseils-scientifique',
                            children: [
                                {
                                    path: 'list',
                                    component: ConseilsScientifiqueChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'instruments-et-dispositifs-ird',
                            children: [
                                {
                                    path: 'list',
                                    component: InstrumentsEtDispositifsIrdChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'niveau-formation',
                            children: [
                                {
                                    path: 'list',
                                    component: NiveauFormationChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'etat-reclamation',
                            children: [
                                {
                                    path: 'list',
                                    component: EtatReclamationChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'notification',
                            children: [
                                {
                                    path: 'list',
                                    component: NotificationChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'vie-institutionnelle-detail-etablissement',
                            children: [
                                {
                                    path: 'list',
                                    component: VieInstitutionnelleDetailEtablissementChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'outil-pedagogique-instrument-ird',
                            children: [
                                {
                                    path: 'list',
                                    component: OutilPedagogiqueInstrumentIrdChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'outil-pedagogique',
                            children: [
                                {
                                    path: 'list',
                                    component: OutilPedagogiqueChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'type-outil-pedagogique',
                            children: [
                                {
                                    path: 'list',
                                    component: TypeOutilPedagogiqueChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'instrument-ird',
                            children: [
                                {
                                    path: 'list',
                                    component: InstrumentIrdChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'sexe',
                            children: [
                                {
                                    path: 'list',
                                    component: SexeChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'discipline-scientifique-chercheur',
                            children: [
                                {
                                    path: 'list',
                                    component: DisciplineScientifiqueChercheurChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'outil-pedagogique-pays-diffusion',
                            children: [
                                {
                                    path: 'list',
                                    component: OutilPedagogiquePaysDiffusionChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'rencontre-media-discipline-scientifique',
                            children: [
                                {
                                    path: 'list',
                                    component: RencontreMediaDisciplineScientifiqueChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'communaute-savoir-evenement-colloque-scientifique',
                            children: [
                                {
                                    path: 'list',
                                    component: CommunauteSavoirEvenementColloqueScientifiqueChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'vie-institutionnelle-detail',
                            children: [
                                {
                                    path: 'list',
                                    component: VieInstitutionnelleDetailChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'publique-formation',
                            children: [
                                {
                                    path: 'list',
                                    component: PubliqueFormationChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'etudiant',
                            children: [
                                {
                                    path: 'list',
                                    component: EtudiantChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'format-rencontre',
                            children: [
                                {
                                    path: 'list',
                                    component: FormatRencontreChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'niveau-responsabilite-pedagogique',
                            children: [
                                {
                                    path: 'list',
                                    component: NiveauResponsabilitePedagogiqueChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'zone-geographique-conseils-scientifique',
                            children: [
                                {
                                    path: 'list',
                                    component: ZoneGeographiqueConseilsScientifiqueChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'enjeux-ird',
                            children: [
                                {
                                    path: 'list',
                                    component: EnjeuxIrdChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'etablissement-consultance-scientifique-ponctuelle',
                            children: [
                                {
                                    path: 'list',
                                    component: EtablissementConsultanceScientifiquePonctuelleChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'campagne-relance-chercheur',
                            children: [
                                {
                                    path: 'list',
                                    component: CampagneRelanceChercheurChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'contrat-et-convention-ird',
                            children: [
                                {
                                    path: 'list',
                                    component: ContratEtConventionIrdChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'publique-professionel',
                            children: [
                                {
                                    path: 'list',
                                    component: PubliqueProfessionelChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'projet-activite-recherche-detail-pays',
                            children: [
                                {
                                    path: 'list',
                                    component: ProjetActiviteRechercheDetailPaysChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'rencontre-grand-publique-jeune-publique-periode',
                            children: [
                                {
                                    path: 'list',
                                    component: RencontreGrandPubliqueJeunePubliquePeriodeChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'pays-formation-continue',
                            children: [
                                {
                                    path: 'list',
                                    component: PaysFormationContinueChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'vie-institutionnelle-detail-instrument-ird',
                            children: [
                                {
                                    path: 'list',
                                    component: VieInstitutionnelleDetailInstrumentIrdChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'discipline-scientifique-erc',
                            children: [
                                {
                                    path: 'list',
                                    component: DisciplineScientifiqueErcChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'evenement-colloque-scienntifique-enjeux-ird',
                            children: [
                                {
                                    path: 'list',
                                    component: EvenementColloqueScienntifiqueEnjeuxIrdChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'culture-scientifique',
                            children: [
                                {
                                    path: 'list',
                                    component: CultureScientifiqueChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                                 ,{
                                    path: 'create',
                                    component: CultureScientifiqueCreateChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'enseignement',
                            children: [
                                {
                                    path: 'list',
                                    component: EnseignementChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'pays-zone-geographique',
                            children: [
                                {
                                    path: 'list',
                                    component: PaysZoneGeographiqueChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'role-projet',
                            children: [
                                {
                                    path: 'list',
                                    component: RoleProjetChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'responsabilite-direction-encadrement-etudiant',
                            children: [
                                {
                                    path: 'list',
                                    component: ResponsabiliteDirectionEncadrementEtudiantChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'encadrement-etudiant',
                            children: [
                                {
                                    path: 'list',
                                    component: EncadrementEtudiantChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'caracterisation',
                            children: [
                                {
                                    path: 'list',
                                    component: CaracterisationChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'etablissement-projet',
                            children: [
                                {
                                    path: 'list',
                                    component: EtablissementProjetChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'contexte',
                            children: [
                                {
                                    path: 'list',
                                    component: ContexteChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'key-word',
                            children: [
                                {
                                    path: 'list',
                                    component: KeyWordChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'enjeux-ird-comite-et-commission-evaluation',
                            children: [
                                {
                                    path: 'list',
                                    component: EnjeuxIrdComiteEtCommissionEvaluationChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'type-expertise-evaluation-comite-et-commission-evaluation',
                            children: [
                                {
                                    path: 'list',
                                    component: TypeExpertiseEvaluationComiteEtCommissionEvaluationChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'rencontre-media',
                            children: [
                                {
                                    path: 'list',
                                    component: RencontreMediaChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'niveau-etude',
                            children: [
                                {
                                    path: 'list',
                                    component: NiveauEtudeChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'entite-administrative',
                            children: [
                                {
                                    path: 'list',
                                    component: EntiteAdministrativeChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'reclamation',
                            children: [
                                {
                                    path: 'list',
                                    component: ReclamationChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'encadrement-etudiant-enjeux-ird',
                            children: [
                                {
                                    path: 'list',
                                    component: EncadrementEtudiantEnjeuxIrdChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'projet-activite-recherche-detail-etablissement-lanceur',
                            children: [
                                {
                                    path: 'list',
                                    component: ProjetActiviteRechercheDetailEtablissementLanceurChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'campagne-rappel',
                            children: [
                                {
                                    path: 'list',
                                    component: CampagneRappelChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'discipline-scientifique-evenement-colloque-scientifique',
                            children: [
                                {
                                    path: 'list',
                                    component: DisciplineScientifiqueEvenementColloqueScientifiqueChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'discipline-scientifique-parent',
                            children: [
                                {
                                    path: 'list',
                                    component: DisciplineScientifiqueParentChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'template-ouverture',
                            children: [
                                {
                                    path: 'list',
                                    component: TemplateOuvertureChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'nature-expertise',
                            children: [
                                {
                                    path: 'list',
                                    component: NatureExpertiseChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'status-cursus',
                            children: [
                                {
                                    path: 'list',
                                    component: StatusCursusChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'outil-pedagogique-discipline-scientifique',
                            children: [
                                {
                                    path: 'list',
                                    component: OutilPedagogiqueDisciplineScientifiqueChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'campagne-rappel-chercheur',
                            children: [
                                {
                                    path: 'list',
                                    component: CampagneRappelChercheurChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'modalite-formation-continue',
                            children: [
                                {
                                    path: 'list',
                                    component: ModaliteFormationContinueChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'identifiant-recherche',
                            children: [
                                {
                                    path: 'list',
                                    component: IdentifiantRechercheChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'encadrement',
                            children: [
                                {
                                    path: 'list',
                                    component: EncadrementChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                                 ,{
                                    path: 'create',
                                    component: EncadrementCreateChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'enjeux-ird-conseils-scientifique',
                            children: [
                                {
                                    path: 'list',
                                    component: EnjeuxIrdConseilsScientifiqueChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'discipline-scientifique-consultance-scientifique-ponctuelle',
                            children: [
                                {
                                    path: 'list',
                                    component: DisciplineScientifiqueConsultanceScientifiquePonctuelleChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'formation-continue-publique-professionel',
                            children: [
                                {
                                    path: 'list',
                                    component: FormationContinuePubliqueProfessionelChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'discipline-scientifique-erc-association',
                            children: [
                                {
                                    path: 'list',
                                    component: DisciplineScientifiqueErcAssociationChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'enseignement-enjeux-ird',
                            children: [
                                {
                                    path: 'list',
                                    component: EnseignementEnjeuxIrdChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'instrument-ird-comite-et-commission-evaluation',
                            children: [
                                {
                                    path: 'list',
                                    component: InstrumentIrdComiteEtCommissionEvaluationChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'discipline-scientifique-conseil-et-comite-scientifique',
                            children: [
                                {
                                    path: 'list',
                                    component: DisciplineScientifiqueConseilEtComiteScientifiqueChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'etat-etape-campagne',
                            children: [
                                {
                                    path: 'list',
                                    component: EtatEtapeCampagneChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'projet-activite-recherche-detail',
                            children: [
                                {
                                    path: 'list',
                                    component: ProjetActiviteRechercheDetailChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'structure-ird',
                            children: [
                                {
                                    path: 'list',
                                    component: StructureIrdChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'expertise',
                            children: [
                                {
                                    path: 'list',
                                    component: ExpertiseChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                                 ,{
                                    path: 'create',
                                    component: ExpertiseCreateChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'type-publique',
                            children: [
                                {
                                    path: 'list',
                                    component: TypePubliqueChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'campagne-chercheur-ouverture',
                            children: [
                                {
                                    path: 'list',
                                    component: CampagneChercheurOuvertureChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'nature-enseignement',
                            children: [
                                {
                                    path: 'list',
                                    component: NatureEnseignementChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'enjeux-ird-consultance-scientifique-ponctuelle',
                            children: [
                                {
                                    path: 'list',
                                    component: EnjeuxIrdConsultanceScientifiquePonctuelleChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'type-utilisateur',
                            children: [
                                {
                                    path: 'list',
                                    component: TypeUtilisateurChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'etablissement-comite-et-commission-evaluation',
                            children: [
                                {
                                    path: 'list',
                                    component: EtablissementComiteEtCommissionEvaluationChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'developpement-de-savoir-et-innovation-scientifique-mode-diffusion',
                            children: [
                                {
                                    path: 'list',
                                    component: DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusionChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'master-international',
                            children: [
                                {
                                    path: 'list',
                                    component: MasterInternationalChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'responsabilite-pedagogique-enjeux-ird',
                            children: [
                                {
                                    path: 'list',
                                    component: ResponsabilitePedagogiqueEnjeuxIrdChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'faq',
                            children: [
                                {
                                    path: 'list',
                                    component: FaqChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'financement-doctorant',
                            children: [
                                {
                                    path: 'list',
                                    component: FinancementDoctorantChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'expertise-scientifique',
                            children: [
                                {
                                    path: 'list',
                                    component: ExpertiseScientifiqueChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                                 ,{
                                    path: 'create',
                                    component: ExpertiseScientifiqueCreateChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'etablissement-enseignement',
                            children: [
                                {
                                    path: 'list',
                                    component: EtablissementEnseignementChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'outil-pedagogique-pays-conception',
                            children: [
                                {
                                    path: 'list',
                                    component: OutilPedagogiquePaysConceptionChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'type-publique-culture-scientifique',
                            children: [
                                {
                                    path: 'list',
                                    component: TypePubliqueCultureScientifiqueChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'campagne-chercheur-fermeture',
                            children: [
                                {
                                    path: 'list',
                                    component: CampagneChercheurFermetureChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'encadrement-doctorant',
                            children: [
                                {
                                    path: 'list',
                                    component: EncadrementDoctorantChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'communaute-savoir-conseil-et-comite-scientifique',
                            children: [
                                {
                                    path: 'list',
                                    component: CommunauteSavoirConseilEtComiteScientifiqueChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'template-cloture',
                            children: [
                                {
                                    path: 'list',
                                    component: TemplateClotureChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'outil-pedagogique-type-instrument-ird',
                            children: [
                                {
                                    path: 'list',
                                    component: OutilPedagogiqueTypeInstrumentIrdChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'etablissement',
                            children: [
                                {
                                    path: 'list',
                                    component: EtablissementChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'commanditaire',
                            children: [
                                {
                                    path: 'list',
                                    component: CommanditaireChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'discipline-scientifique-erc-parent',
                            children: [
                                {
                                    path: 'list',
                                    component: DisciplineScientifiqueErcParentChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'developpement-de-savoir-et-innovation-scientifique-discipline-scientifique',
                            children: [
                                {
                                    path: 'list',
                                    component: DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'role-comite-et-commission-evaluation',
                            children: [
                                {
                                    path: 'list',
                                    component: RoleComiteEtCommissionEvaluationChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'niveau-formation-post-bac',
                            children: [
                                {
                                    path: 'list',
                                    component: NiveauFormationPostBacChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'chercheur-email',
                            children: [
                                {
                                    path: 'list',
                                    component: ChercheurEmailChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'enjeux-ird-chercheur',
                            children: [
                                {
                                    path: 'list',
                                    component: EnjeuxIrdChercheurChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'type-entite-administrative',
                            children: [
                                {
                                    path: 'list',
                                    component: TypeEntiteAdministrativeChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'projet-activite-recherche-detail-enjeux-ird',
                            children: [
                                {
                                    path: 'list',
                                    component: ProjetActiviteRechercheDetailEnjeuxIrdChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'type-publique-rencontre-grand-publique-jeune-publique',
                            children: [
                                {
                                    path: 'list',
                                    component: TypePubliqueRencontreGrandPubliqueJeunePubliqueChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'enseignement-discipline-scientifique',
                            children: [
                                {
                                    path: 'list',
                                    component: EnseignementDisciplineScientifiqueChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'key-word-discipline-scientifique-erc',
                            children: [
                                {
                                    path: 'list',
                                    component: KeyWordDisciplineScientifiqueErcChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'communaute-savoir-chercheur',
                            children: [
                                {
                                    path: 'list',
                                    component: CommunauteSavoirChercheurChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'categorie-faq',
                            children: [
                                {
                                    path: 'list',
                                    component: CategorieFaqChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'comite-et-commission-evaluation',
                            children: [
                                {
                                    path: 'list',
                                    component: ComiteEtCommissionEvaluationChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'modalite-etude',
                            children: [
                                {
                                    path: 'list',
                                    component: ModaliteEtudeChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'evenement-colloque-scienntifique',
                            children: [
                                {
                                    path: 'list',
                                    component: EvenementColloqueScienntifiqueChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'formation-continue-objet-formation-generique',
                            children: [
                                {
                                    path: 'list',
                                    component: FormationContinueObjetFormationGeneriqueChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'formation-continue',
                            children: [
                                {
                                    path: 'list',
                                    component: FormationContinueChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'projet-activite-recherche-detail-institution-co-contractant',
                            children: [
                                {
                                    path: 'list',
                                    component: ProjetActiviteRechercheDetailInstitutionCoContractantChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'consultance-scientifique-ponctuelle',
                            children: [
                                {
                                    path: 'list',
                                    component: ConsultanceScientifiquePonctuelleChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'modalite-intervention',
                            children: [
                                {
                                    path: 'list',
                                    component: ModaliteInterventionChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'zone-geographique-formation-continue',
                            children: [
                                {
                                    path: 'list',
                                    component: ZoneGeographiqueFormationContinueChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'projet-activite-recherche-detail-instrument-ird',
                            children: [
                                {
                                    path: 'list',
                                    component: ProjetActiviteRechercheDetailInstrumentIrdChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'rencontre-grand-publique-jeune-publique-instrument-ird',
                            children: [
                                {
                                    path: 'list',
                                    component: RencontreGrandPubliqueJeunePubliqueInstrumentIrdChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'type-instrument-ird-consultance-scientifique-ponctuelle',
                            children: [
                                {
                                    path: 'list',
                                    component: TypeInstrumentIrdConsultanceScientifiquePonctuelleChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'nature-activite-grand-publique',
                            children: [
                                {
                                    path: 'list',
                                    component: NatureActiviteGrandPubliqueChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'developpement-de-savoir-et-innovation-scientifique-pays',
                            children: [
                                {
                                    path: 'list',
                                    component: DeveloppementDeSavoirEtInnovationScientifiquePaysChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'zone-geographique',
                            children: [
                                {
                                    path: 'list',
                                    component: ZoneGeographiqueChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'commission-scientifique',
                            children: [
                                {
                                    path: 'list',
                                    component: CommissionScientifiqueChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'role-developpement-de-savoir',
                            children: [
                                {
                                    path: 'list',
                                    component: RoleDeveloppementDeSavoirChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'type-utilisateur-savoir-concu',
                            children: [
                                {
                                    path: 'list',
                                    component: TypeUtilisateurSavoirConcuChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'nature-etude',
                            children: [
                                {
                                    path: 'list',
                                    component: NatureEtudeChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'encadrement-etudiant-discipline-scientifique',
                            children: [
                                {
                                    path: 'list',
                                    component: EncadrementEtudiantDisciplineScientifiqueChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'communaute-savoir-expertise-scientifique',
                            children: [
                                {
                                    path: 'list',
                                    component: CommunauteSavoirExpertiseScientifiqueChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'template-rappel',
                            children: [
                                {
                                    path: 'list',
                                    component: TemplateRappelChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'type-reclamation',
                            children: [
                                {
                                    path: 'list',
                                    component: TypeReclamationChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'discipline-scientifique-comite-et-commission-evaluation',
                            children: [
                                {
                                    path: 'list',
                                    component: DisciplineScientifiqueComiteEtCommissionEvaluationChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'type-instrument-ird',
                            children: [
                                {
                                    path: 'list',
                                    component: TypeInstrumentIrdChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'distinction-etablissement-pays',
                            children: [
                                {
                                    path: 'list',
                                    component: DistinctionEtablissementPaysChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'instrument-ird-chercheur',
                            children: [
                                {
                                    path: 'list',
                                    component: InstrumentIrdChercheurChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'rencontre-grand-publique-jeune-publique-enjeux-ird',
                            children: [
                                {
                                    path: 'list',
                                    component: RencontreGrandPubliqueJeunePubliqueEnjeuxIrdChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'discipline-scientifique',
                            children: [
                                {
                                    path: 'list',
                                    component: DisciplineScientifiqueChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'type-expertise',
                            children: [
                                {
                                    path: 'list',
                                    component: TypeExpertiseChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'doctorant',
                            children: [
                                {
                                    path: 'list',
                                    component: DoctorantChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'corps',
                            children: [
                                {
                                    path: 'list',
                                    component: CorpsChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'enseignement-et-formation',
                            children: [
                                {
                                    path: 'list',
                                    component: EnseignementEtFormationChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                                 ,{
                                    path: 'create',
                                    component: EnseignementEtFormationCreateChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'departement-scientifique',
                            children: [
                                {
                                    path: 'list',
                                    component: DepartementScientifiqueChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'pays-organisateur-rencontre-grand-publique-jeune-publique',
                            children: [
                                {
                                    path: 'list',
                                    component: PaysOrganisateurRencontreGrandPubliqueJeunePubliqueChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'communaute-savoir',
                            children: [
                                {
                                    path: 'list',
                                    component: CommunauteSavoirChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'discipline-scientifique-expertise-scientifique',
                            children: [
                                {
                                    path: 'list',
                                    component: DisciplineScientifiqueExpertiseScientifiqueChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'outil-pedagogique-enjeux-ird',
                            children: [
                                {
                                    path: 'list',
                                    component: OutilPedagogiqueEnjeuxIrdChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'responsabilite-encadrement-doctorant',
                            children: [
                                {
                                    path: 'list',
                                    component: ResponsabiliteEncadrementDoctorantChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'rencontre-grand-publique-jeune-publique-discipline-scientifique',
                            children: [
                                {
                                    path: 'list',
                                    component: RencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'gestion-equipe',
                            children: [
                                {
                                    path: 'list',
                                    component: GestionEquipeChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                                 ,{
                                    path: 'create',
                                    component: GestionEquipeCreateChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'distinction',
                            children: [
                                {
                                    path: 'list',
                                    component: DistinctionChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                                 ,{
                                    path: 'create',
                                    component: DistinctionCreateChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'campagne-relance',
                            children: [
                                {
                                    path: 'list',
                                    component: CampagneRelanceChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'rencontre-media-enjeux-ird',
                            children: [
                                {
                                    path: 'list',
                                    component: RencontreMediaEnjeuxIrdChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'responsabilite-pedagogique-pays',
                            children: [
                                {
                                    path: 'list',
                                    component: ResponsabilitePedagogiquePaysChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'type-publique-rencontre-media',
                            children: [
                                {
                                    path: 'list',
                                    component: TypePubliqueRencontreMediaChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'formation-continue-enjeux-ird',
                            children: [
                                {
                                    path: 'list',
                                    component: FormationContinueEnjeuxIrdChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'zone-geographique-consultance-scientifique-ponctuelle',
                            children: [
                                {
                                    path: 'list',
                                    component: ZoneGeographiqueConsultanceScientifiquePonctuelleChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'rencontre-media-periode',
                            children: [
                                {
                                    path: 'list',
                                    component: RencontreMediaPeriodeChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'pays-rencontre-grand-publique-jeune-publique',
                            children: [
                                {
                                    path: 'list',
                                    component: PaysRencontreGrandPubliqueJeunePubliqueChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'communaute-savoir-projet-activite-recherche',
                            children: [
                                {
                                    path: 'list',
                                    component: CommunauteSavoirProjetActiviteRechercheChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'pays',
                            children: [
                                {
                                    path: 'list',
                                    component: PaysChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'outil-pedagogique-langue',
                            children: [
                                {
                                    path: 'list',
                                    component: OutilPedagogiqueLangueChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'instrument-ird-consultance-scientifique-ponctuelle',
                            children: [
                                {
                                    path: 'list',
                                    component: InstrumentIrdConsultanceScientifiquePonctuelleChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'projet-activite-recherche',
                            children: [
                                {
                                    path: 'list',
                                    component: ProjetActiviteRechercheChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                                 ,{
                                    path: 'create',
                                    component: ProjetActiviteRechercheCreateChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'responsabilite-pedagogique-etablissement',
                            children: [
                                {
                                    path: 'list',
                                    component: ResponsabilitePedagogiqueEtablissementChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'developpement-de-savoir-et-innovation-scientifique-etablissement',
                            children: [
                                {
                                    path: 'list',
                                    component: DeveloppementDeSavoirEtInnovationScientifiqueEtablissementChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'type-instance',
                            children: [
                                {
                                    path: 'list',
                                    component: TypeInstanceChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'mode-diffusion',
                            children: [
                                {
                                    path: 'list',
                                    component: ModeDiffusionChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'objet-formation-generique-de-responsabilite-pedagogique',
                            children: [
                                {
                                    path: 'list',
                                    component: ObjetFormationGeneriqueDeResponsabilitePedagogiqueChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'type-instrument-ird-chercheur',
                            children: [
                                {
                                    path: 'list',
                                    component: TypeInstrumentIrdChercheurChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'template-relance',
                            children: [
                                {
                                    path: 'list',
                                    component: TemplateRelanceChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'etablissement-partenaire',
                            children: [
                                {
                                    path: 'list',
                                    component: EtablissementPartenaireChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'discipline-scientifique-encadrement-doctorant',
                            children: [
                                {
                                    path: 'list',
                                    component: DisciplineScientifiqueEncadrementDoctorantChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'pays-rencontre-media',
                            children: [
                                {
                                    path: 'list',
                                    component: PaysRencontreMediaChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'role-evaluation',
                            children: [
                                {
                                    path: 'list',
                                    component: RoleEvaluationChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'rencontre-grand-publique-jeune-publique',
                            children: [
                                {
                                    path: 'list',
                                    component: RencontreGrandPubliqueJeunePubliqueChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'type-participation',
                            children: [
                                {
                                    path: 'list',
                                    component: TypeParticipationChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'evenement-colloque-scienntifique-pays',
                            children: [
                                {
                                    path: 'list',
                                    component: EvenementColloqueScienntifiquePaysChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'type-expertise-evaluation',
                            children: [
                                {
                                    path: 'list',
                                    component: TypeExpertiseEvaluationChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'etat-campagne',
                            children: [
                                {
                                    path: 'list',
                                    component: EtatCampagneChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'type-savoir',
                            children: [
                                {
                                    path: 'list',
                                    component: TypeSavoirChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'developpement-de-savoir-et-innovation-scientifique-enjeux-ird',
                            children: [
                                {
                                    path: 'list',
                                    component: DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrdChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'institution',
                            children: [
                                {
                                    path: 'list',
                                    component: InstitutionChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'structure-oganisatrice',
                            children: [
                                {
                                    path: 'list',
                                    component: StructureOganisatriceChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'discipline-scientifique-encadrement-etudiant',
                            children: [
                                {
                                    path: 'list',
                                    component: DisciplineScientifiqueEncadrementEtudiantChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'formation-continue-commanditaire',
                            children: [
                                {
                                    path: 'list',
                                    component: FormationContinueCommanditaireChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'affectation-structurelle',
                            children: [
                                {
                                    path: 'list',
                                    component: AffectationStructurelleChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'caracterisation-developpement-de-savoir-et-innovation-scientifique',
                            children: [
                                {
                                    path: 'list',
                                    component: CaracterisationDeveloppementDeSavoirEtInnovationScientifiqueChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'publique-cible',
                            children: [
                                {
                                    path: 'list',
                                    component: PubliqueCibleChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'nationalite',
                            children: [
                                {
                                    path: 'list',
                                    component: NationaliteChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'pays-commanditaire',
                            children: [
                                {
                                    path: 'list',
                                    component: PaysCommanditaireChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'rencontre-grand-publique-jeune-publique-type-instrument-ird',
                            children: [
                                {
                                    path: 'list',
                                    component: RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'type-enseignement',
                            children: [
                                {
                                    path: 'list',
                                    component: TypeEnseignementChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'formation-continue-discipline-scientifique',
                            children: [
                                {
                                    path: 'list',
                                    component: FormationContinueDisciplineScientifiqueChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'enjeux-ird-encadrement-doctorant',
                            children: [
                                {
                                    path: 'list',
                                    component: EnjeuxIrdEncadrementDoctorantChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'enseignement-nature',
                            children: [
                                {
                                    path: 'list',
                                    component: EnseignementNatureChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'type-savoir-developpement-de-savoir-et-innovation-scientifique',
                            children: [
                                {
                                    path: 'list',
                                    component: TypeSavoirDeveloppementDeSavoirEtInnovationScientifiqueChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'niveau-etude-enseignement',
                            children: [
                                {
                                    path: 'list',
                                    component: NiveauEtudeEnseignementChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'categorie-notification',
                            children: [
                                {
                                    path: 'list',
                                    component: CategorieNotificationChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'chercheur',
                            children: [
                                {
                                    path: 'list',
                                    component: ChercheurChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'etablissement-conseils-scientifique',
                            children: [
                                {
                                    path: 'list',
                                    component: EtablissementConseilsScientifiqueChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'campagne',
                            children: [
                                {
                                    path: 'list',
                                    component: CampagneChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'etat-campagne-chercheur',
                            children: [
                                {
                                    path: 'list',
                                    component: EtatCampagneChercheurChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },
                        {

                            path: 'objet-formation-generique',
                            children: [
                                {
                                    path: 'list',
                                    component: ObjetFormationGeneriqueChercheurComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                    ]
                },
            ]
        ),
    ],
    exports: [RouterModule],
})
export class ChercheurRoutingModule { }
